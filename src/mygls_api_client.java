import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;

import org.apache.axis.encoding.Base64;
import org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.Address;
import org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.GetPrintedLabelsRequest;
import org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.GetPrintedLabelsResponse;
import org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.Parcel;
import org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.PrepareLabelsRequest;
import org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.PrepareLabelsResponse;
import org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.PrintLabelsRequest;
import org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.PrintLabelsResponse;
import org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.Service;
import org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.ServiceParameterStringInteger;
import org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations.GetParcelListRequest;
import org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations.GetParcelListResponse;
import org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations.GetParcelStatusesRequest;
import org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations.GetParcelStatusResponse;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.tempuri.ParcelServiceProxy;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.tempuri.MasterDataServiceProxy;

public class mygls_api_client {
    /*HELP:
     * + In case of REST client:
     *   - the external JAR file in the JARs folder: project Properties->Java Build Path->json-simple-2.3.0.jar
     * + In case of SOAP client:
     *   - the external JAR files in the JARs folder: project Properties->Java Build Path->activation.jar,javax.mail-1.4.6.jar
     *   - creating a proxy: https://www.eclipse.org/webtools/community/education/web/t320/Generating_a_client_from_WSDL.pdf
     */

    //Test ClientNumber:
    public static int _clientNumber = 100000001; //!!!NOT FOR CUSTOMER TESTING, USE YOUR OWN, USE YOUR OWN!!!

    //Test username:
    public static String _username = "customerservice@euro-ff.com"; //!!!NOT FOR CUSTOMER TESTING, USE YOUR OWN, USE YOUR OWN!!!

    //Test password:
    public static String _password = "Z864XGY8i96KE4F"; //!!!NOT FOR CUSTOMER TESTING, USE YOUR OWN, USE YOUR OWN!!!

    public static ParcelServiceProxy _parcelServiceProxy = new ParcelServiceProxy();

    public static String _url = "https://api.test.mygls.hu/SERVICE_NAME.svc/";

    public static String _serviceName = "";

    public static final String PRINTLABELS = "PrintLabels";
    public static final String PREPARELABELS = "PrepareLabels";
    public static final String GETPRINTEDLABELS = "GetPrintedLabels";
    public static final String GETPARCELLIST = "GetParcelList";
    public static final String GETPARCELSTATUSES = "GetParcelStatuses";

    public static void main(String[] args) {
        try {
            //SOAP EXAMPLES:

            // Parcel service:
//    		SoapClientPrintLabels();
//    		SoapClientGetPrintedLabels(SoapClientPrepareLabels());
//    		SoapClientGetParcelList();
//    		SoapClientGetParcelStatuses();

            //REST EXAMPLES:
            boolean isXmlFormat = false;

            // Parcel service:
            _serviceName = "ParcelService";
            RestClientPrintLabels(isXmlFormat);
            RestClientGetPrintedLabels(RestClientPrepareLabels(isXmlFormat), isXmlFormat);
            RestClientGetParcelList(isXmlFormat);
            RestClientGetParcelStatuses(isXmlFormat);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //SOAP:

    // Parcel service:

    /**
     * Label(s) generation by the service.
     *
     * @throws NoSuchAlgorithmException
     * @throws RemoteException
     * @throws java.text.ParseException
     */
    public static void SoapClientPrintLabels() throws RemoteException, java.text.ParseException, NoSuchAlgorithmException {
        //Service calling:
        PrintLabelsResponse response = _parcelServiceProxy.printLabels(((PrintLabelsRequest) GetRequestObject(PRINTLABELS)));

        if (response != null && response.getPrintLabelsErrorList().length == 0 && response.getLabels().length > 0) {
            //Label(s) saving:
            WriteBytesToFile(response.getLabels(), "java_clients_soap_" + PRINTLABELS + ".pdf");
        }
    }

    /**
     * Preparing label(s) by the service.
     *
     * @return GetPrintedLabelsRequest
     * @throws NoSuchAlgorithmException
     * @throws RemoteException
     * @throws java.text.ParseException
     */
    public static GetPrintedLabelsRequest SoapClientPrepareLabels() throws NoSuchAlgorithmException, RemoteException, java.text.ParseException {
        //Service calling:
        PrepareLabelsResponse response = _parcelServiceProxy.prepareLabels(((PrepareLabelsRequest) GetRequestObject(PREPARELABELS)));

        int[] parcelIds = new int[1];
        if (response != null && response.getPrepareLabelsError().length == 0 && response.getParcelInfoList().length > 0) {
            parcelIds[0] = response.getParcelInfoList()[0].getParcelId();
        }

        //Test request:
        GetPrintedLabelsRequest request = new GetPrintedLabelsRequest();
        request.setUsername(_username);
        request.setPassword(GetPasswordByteArray());
        request.setParcelIdList(parcelIds);
        request.setPrintPosition(1);
        request.setShowPrintDialog(false);

        return request;
    }

    /**
     * Get label(s) by the service.
     *
     * @param request
     * @throws RemoteException
     */
    public static void SoapClientGetPrintedLabels(GetPrintedLabelsRequest request) throws RemoteException {
        //Service calling:
        GetPrintedLabelsResponse response = _parcelServiceProxy.getPrintedLabels(request);

        if (response != null && response.getGetPrintedLabelsErrorList().length == 0 && response.getLabels().length > 0) {
            //Label(s) saving:
            WriteBytesToFile(response.getLabels(), "java_clients_soap_" + GETPRINTEDLABELS + ".pdf");
        }
    }

    /**
     * Get parcel(s) information by date ranges.
     *
     * @throws NoSuchAlgorithmException
     * @throws RemoteException
     * @throws java.text.ParseException
     */
    public static void SoapClientGetParcelList() throws NoSuchAlgorithmException, RemoteException, java.text.ParseException {
        //Service calling:
        GetParcelListResponse response = _parcelServiceProxy.getParcelList(((GetParcelListRequest) GetRequestObject(GETPARCELLIST)));

        System.out.println(response.getGetParcelListErrors().length);
        System.out.println(response.getPrintDataInfoList().length);
    }

    /**
     * Get parcel statuses.
     *
     * @throws NoSuchAlgorithmException
     * @throws java.text.ParseException
     * @throws RemoteException
     */
    public static void SoapClientGetParcelStatuses() throws NoSuchAlgorithmException, java.text.ParseException, RemoteException {
        //Service calling:
        GetParcelStatusResponse response = _parcelServiceProxy.getParcelStatuses(((GetParcelStatusesRequest) GetRequestObject(GETPARCELSTATUSES)));

        System.out.println(response.getGetParcelStatusErrors().length);
        if (response != null && response.getGetParcelStatusErrors().length == 0 && response.getPOD() != null && response.getPOD().length > 0) {
            //POD saving:
            WriteBytesToFile(response.getPOD(), "java_clients_soap_" + GETPARCELSTATUSES + ".pdf");
        }
    }

    //REST:

    // Parcel service:

    /**
     * Label(s) generation by the service.
     *
     * @param isXmlFormat
     * @throws MalformedURLException
     * @throws IOException
     * @throws ParseException
     * @throws NoSuchAlgorithmException
     * @throws java.text.ParseException
     */
    public static void RestClientPrintLabels(boolean isXmlFormat) throws MalformedURLException, IOException, ParseException, NoSuchAlgorithmException, java.text.ParseException {
        String response = "";

        if (isXmlFormat == false) {
            //Test request:
            String json = GetJsonFromFile(PRINTLABELS + "Request.json");

            //replace authentication data:
            json = json.replaceFirst("C_L_I_N_E_T_N_U_M_B_E_R", Integer.toString(_clientNumber));
            json = json.replaceFirst("\"P_A_S_S_W_O_R_D\"", GetPasswordByteArrayAsString());
            json = json.replaceFirst("U_S_E_R_N_A_M_E", _username);

            response = GetResponse(PRINTLABELS, json, isXmlFormat);
        } else {
            String xml = GetXmlVersionOfTheObject(((PrintLabelsRequest) GetRequestObject(PRINTLABELS)), PRINTLABELS);
            xml = PrepareRequestForSending(xml, PRINTLABELS);

            response = GetResponse(PRINTLABELS, xml, isXmlFormat);
        }

        if (response.equals("") == false) {
            //Label(s) data finding:
            final Pattern pattern = Pattern.compile("<Labels>(.+?)</Labels>", Pattern.DOTALL);
            final Matcher matcher = pattern.matcher(response.toString());
            if (matcher.find() == true) {
                //Label(s) saving:
                byte[] pdfAsBytes = Base64.decode(matcher.group(1));
                FileOutputStream fileOutputStream;
                final File labels = new File("java_clients_rest_" + PRINTLABELS + ".pdf");
                fileOutputStream = new FileOutputStream(labels, false);
                fileOutputStream.write(pdfAsBytes);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
        }
    }

    /**
     * Preparing label(s) by the service.
     *
     * @param isXmlFormat
     * @return String
     * @throws FileNotFoundException
     * @throws ParseException
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws java.text.ParseException
     */
    public static String RestClientPrepareLabels(boolean isXmlFormat) throws FileNotFoundException, ParseException, IOException, NoSuchAlgorithmException, java.text.ParseException {
        String response = "";

        if (isXmlFormat == false) {
            //Test request:
            String step1Request = GetJsonFromFile(PREPARELABELS + "Request.json");

            //replace authentication data:
            step1Request = step1Request.replaceFirst("C_L_I_N_E_T_N_U_M_B_E_R", Integer.toString(_clientNumber));
            step1Request = step1Request.replaceFirst("\"P_A_S_S_W_O_R_D\"", GetPasswordByteArrayAsString());
            step1Request = step1Request.replaceFirst("U_S_E_R_N_A_M_E", _username);

            response = GetResponse(PREPARELABELS, step1Request, isXmlFormat);
        } else {
            String xml = GetXmlVersionOfTheObject(((PrepareLabelsRequest) GetRequestObject(PREPARELABELS)), PREPARELABELS);
            xml = PrepareRequestForSending(xml, PREPARELABELS);

            response = GetResponse(PREPARELABELS, xml, isXmlFormat);
        }

        int[] parcelIds = new int[1];

        if (response.equals("") == false) {
            //ParcelId(s) data finding:
            final Pattern pattern = Pattern.compile("<ParcelId>(.+?)</ParcelId>", Pattern.DOTALL);
            final Matcher matcher = pattern.matcher(response.toString());
            if (matcher.find() == true) {
                parcelIds[0] = Integer.parseInt(matcher.group(1));
            }
        }

        if (isXmlFormat == false) {
            String step2Request = "{" +
                    "  \"Username\" : \"" + _username + "\"," +
                    "  \"Password\" : " + GetPasswordByteArrayAsString() + "," +
                    "  \"ParcelIdList\" : [ " + parcelIds[0] + " ]," +
                    "  \"PrintPosition\" : 1," +
                    "  \"ShowPrintDialog\" : 0" +
                    "}";

            JSONParser parser = new JSONParser();
            JSONObject step2RequestJson = (JSONObject) parser.parse(step2Request);

            return step2RequestJson.toString();
        } else {
            //Test request:
            GetPrintedLabelsRequest request = new GetPrintedLabelsRequest();
            request.setUsername(_username);
            request.setPassword(GetPasswordByteArray());
            request.setParcelIdList(parcelIds);
            request.setPrintPosition(1);
            request.setShowPrintDialog(false);

            String xml = GetXmlVersionOfTheObject(request, GETPRINTEDLABELS);
            xml = PrepareRequestForSending(xml, GETPRINTEDLABELS);

            return xml;
        }
    }

    /**
     * Get label(s) by the service.
     *
     * @param request
     * @param isXmlFormat
     * @throws IOException
     */
    public static void RestClientGetPrintedLabels(String request, boolean isXmlFormat) throws IOException {
        String response = GetResponse(GETPRINTEDLABELS, request, isXmlFormat);

        if (response.equals("") == false) {
            //Label(s) data finding:
            final Pattern pattern = Pattern.compile("<Labels>(.+?)</Labels>", Pattern.DOTALL);
            final Matcher matcher = pattern.matcher(response.toString());
            if (matcher.find() == true) {
                //Label(s) saving:
                byte[] pdfAsBytes = Base64.decode(matcher.group(1));
                FileOutputStream fileOutputStream;
                final File labels = new File("java_clients_rest_" + GETPRINTEDLABELS + ".pdf");
                fileOutputStream = new FileOutputStream(labels, false);
                fileOutputStream.write(pdfAsBytes);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
        }
    }

    /**
     * Get parcel(s) information by date ranges.
     *
     * @param isXmlFormat
     * @throws java.text.ParseException
     * @throws NoSuchAlgorithmException
     * @throws MalformedURLException
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws java.text.ParseException
     */
    public static void RestClientGetParcelList(boolean isXmlFormat) throws NoSuchAlgorithmException, MalformedURLException, IOException, ParserConfigurationException, SAXException, java.text.ParseException {
        String response = "";

        if (isXmlFormat == false) {
            //Test request:
            String request = "{" +
                    "  \"Username\" : \"" + _username + "\"," +
                    "  \"Password\" : " + GetPasswordByteArrayAsString() + "," +
                    "  \"PickupDateFrom\" : \"\\/Date(" + GetObjectFromDateString("2020-04-16 23:59:59").getTime().getTime() + ")\\/\"," +
                    "  \"PickupDateTo\" : \"\\/Date(" + GetObjectFromDateString("2020-04-16 23:59:59").getTime().getTime() + ")\\/\"," +
                    "  \"PrintDateFrom\" : null," +
                    "  \"PrintDateTo\" : null," +
                    "}";

            response = GetResponse(GETPARCELLIST, request, isXmlFormat);
        } else {
            String xml = GetXmlVersionOfTheObject(((GetParcelListRequest) GetRequestObject(GETPARCELLIST)), GETPARCELLIST);
            xml = PrepareRequestForSending(xml, GETPARCELLIST);

            response = GetResponse(GETPARCELLIST, xml, isXmlFormat);
        }

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(new StringReader(response)));

        NodeList errorInfoList = document.getElementsByTagName("a:ErrorInfo");
        NodeList printDataInfoList = document.getElementsByTagName("a:PrintDataInfo");

        System.out.println(errorInfoList.getLength());
        System.out.println(printDataInfoList.getLength());
    }

    /**
     * Get parcel statuses.
     *
     * @param isXmlFormat
     * @throws MalformedURLException
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws java.text.ParseException
     */
    public static void RestClientGetParcelStatuses(boolean isXmlFormat) throws MalformedURLException, IOException, NoSuchAlgorithmException, ParserConfigurationException, SAXException, java.text.ParseException {
        String response = "";

        if (isXmlFormat == false) {
            //Test request:
            String request = "{" +
                    "  \"Username\" : \"" + _username + "\"," +
                    "  \"Password\" : " + GetPasswordByteArrayAsString() + "," +
                    "  \"ReturnPOD\" : true," +
                    "  \"ParcelNumber\" : 0," +
                    "  \"LanguageIsoCode\" : \"HU\"," +
                    "}";

            response = GetResponse(GETPARCELSTATUSES, request, isXmlFormat);
        } else {
            String xml = GetXmlVersionOfTheObject(((GetParcelStatusesRequest) GetRequestObject(GETPARCELSTATUSES)), GETPARCELSTATUSES);
            xml = PrepareRequestForSending(xml, GETPARCELSTATUSES);

            response = GetResponse(GETPARCELSTATUSES, xml, isXmlFormat);
        }

        if (response.equals("") == false) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new StringReader(response)));

            NodeList errorInfoList = document.getElementsByTagName("a:ErrorInfo");
            System.out.println(errorInfoList.getLength());

            //POD data finding:
            final Pattern pattern = Pattern.compile("<POD>(.+?)</POD>", Pattern.DOTALL);
            final Matcher matcher = pattern.matcher(response.toString());
            if (matcher.find() == true) {
                //POD saving:
                byte[] pdfAsBytes = Base64.decode(matcher.group(1));
                FileOutputStream fileOutputStream;
                final File labels = new File("java_clients_rest_" + GETPARCELSTATUSES + ".pdf");
                fileOutputStream = new FileOutputStream(labels, false);
                fileOutputStream.write(pdfAsBytes);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
        }
    }

    // Utility functions:

    /**
     * Get request object.
     *
     * @param method
     * @return
     * @throws NoSuchAlgorithmException
     * @throws java.text.ParseException
     */
    private static Object GetRequestObject(String method) throws NoSuchAlgorithmException, java.text.ParseException {
        //Test request:

        Object result = null;

        if (method == GETPARCELLIST) {
            GetParcelListRequest request = new GetParcelListRequest();
            request.setUsername(_username);
            request.setPassword(GetPasswordByteArray());
            request.setPickupDateFrom(GetObjectFromDateString("2020-04-16 23:59:59"));
            request.setPickupDateTo(GetObjectFromDateString("2020-04-16 23:59:59"));

            result = request;
        }

        if (method == PRINTLABELS) {
            PrintLabelsRequest request = new PrintLabelsRequest();
            request.setUsername(_username);
            request.setPassword(GetPasswordByteArray());
            request.setParcelList(PrepareParcelData(_clientNumber));
            request.setPrintPosition(1);
            request.setShowPrintDialog(false);

            result = request;
        }

        if (method == PREPARELABELS) {
            PrepareLabelsRequest request = new PrepareLabelsRequest();
            request.setUsername(_username);
            request.setPassword(GetPasswordByteArray());
            request.setParcelList(PrepareParcelData(_clientNumber));

            result = request;
        }

        if (method == GETPARCELSTATUSES) {
            GetParcelStatusesRequest request = new GetParcelStatusesRequest();
            request.setUsername(_username);
            byte[] password = GetPasswordByteArray();
            request.setPassword(password);
            request.setLanguageIsoCode("HU");
            request.setParcelNumber(0L); //ATTENTION: the auto generated "GetParcelStatusesRequest" proxy class is modified manually?
            request.setReturnPOD(true);

            result = request;
        }

        return result;
    }

    /**
     * Manage common XML nodes.
     *
     * @param request
     * @return
     */
    private static String ManageCommonXmlNodes(String request) {
        Hashtable<String, String> commonXmlNodes = new Hashtable<String, String>();
        commonXmlNodes.put("<password>", "<ClientNumberList xmlns=\"http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common\" xmlns:a=\"http://schemas.microsoft.com/2003/10/Serialization/Arrays\"/><Password xmlns=\"http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common\">");
        commonXmlNodes.put("</password>", "</Password>");
        commonXmlNodes.put("<username>", "<Username xmlns=\"http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common\">");
        commonXmlNodes.put("</username>", "</Username>");

        Set<String> commonXmlNodeKeys = commonXmlNodes.keySet();
        for (String key : commonXmlNodeKeys) {
            request = request.replace(key, commonXmlNodes.get(key));
        }

        return request;
    }

    /**
     * Manage XML nodes.
     *
     * @param request
     * @param method
     * @return
     */
    private static String ManageXmlNodes(String request, String method) {
        Hashtable<String, String> xmlNodes = new Hashtable<String, String>();

        if (method == PRINTLABELS || method == PREPARELABELS) {
            xmlNodes.put("<parcelList>", "<ParcelList><Parcel>");
            xmlNodes.put("</parcelList>", "</Parcel></ParcelList>");
            xmlNodes.put("<clientNumber>", "<ClientNumber>");
            xmlNodes.put("</clientNumber>", "</ClientNumber>");
            xmlNodes.put("<clientReference>", "<ClientReference>");
            xmlNodes.put("</clientReference>", "</ClientReference>");
            xmlNodes.put("<content>", "<Content>");
            xmlNodes.put("</content>", "</Content>");
            xmlNodes.put("<count>", "<Count>");
            xmlNodes.put("</count>", "</Count>");
            xmlNodes.put("<deliveryAddress>", "<DeliveryAddress>");
            xmlNodes.put("</deliveryAddress>", "</DeliveryAddress>");
            xmlNodes.put("<city>", "<City>");
            xmlNodes.put("</city>", "</City>");
            xmlNodes.put("<contactEmail>", "<ContactEmail>");
            xmlNodes.put("</contactEmail>", "</ContactEmail>");
            xmlNodes.put("<contactName>", "<ContactName>");
            xmlNodes.put("</contactName>", "</ContactName>");
            xmlNodes.put("<contactPhone>", "<ContactPhone>");
            xmlNodes.put("</contactPhone>", "</ContactPhone>");
            xmlNodes.put("<countryIsoCode>", "<CountryIsoCode>");
            xmlNodes.put("</countryIsoCode>", "</CountryIsoCode>");
            xmlNodes.put("<houseNumber>", "<HouseNumber>");
            xmlNodes.put("</houseNumber>", "</HouseNumber>");
            xmlNodes.put("<houseNumberInfo>", "<HouseNumberInfo>");
            xmlNodes.put("</houseNumberInfo>", "</HouseNumberInfo>");
            xmlNodes.put("<name>", "<Name>");
            xmlNodes.put("</name>", "</Name>");
            xmlNodes.put("<street>", "<Street>");
            xmlNodes.put("</street>", "</Street>");
            xmlNodes.put("<zipCode>", "<ZipCode>");
            xmlNodes.put("</zipCode>", "</ZipCode>");
            xmlNodes.put("<pickupAddress>", "<PickupAddress>");
            xmlNodes.put("</pickupAddress>", "</PickupAddress>");
            xmlNodes.put("<pickupDate>", "<PickupDate>");
            xmlNodes.put("</pickupDate>", "</PickupDate>");
            xmlNodes.put("<serviceList>", "<ServiceList>");
            xmlNodes.put("</serviceList>", "</ServiceList>");
        }

        if (method == PRINTLABELS || method == GETPRINTEDLABELS) {
            xmlNodes.put("<printPosition>", "<PrintPosition>");
            xmlNodes.put("</printPosition>", "</PrintPosition>");
            xmlNodes.put("<showPrintDialog>", "<ShowPrintDialog>");
            xmlNodes.put("</showPrintDialog>", "</ShowPrintDialog>");
        }

        if (method == GETPRINTEDLABELS) {
            xmlNodes.put("<parcelIdList>", "<ParcelIdList xmlns:a=\"http://schemas.microsoft.com/2003/10/Serialization/Arrays\"><a:int>");
            xmlNodes.put("</parcelIdList>", "</a:int></ParcelIdList>");
        }

        if (method == GETPARCELLIST) {
            xmlNodes.put("<pickupDateFrom>", "<PickupDateFrom>");
            xmlNodes.put("</pickupDateFrom>", "</PickupDateFrom>");
            xmlNodes.put("<pickupDateTo>", "<PickupDateTo>");
            xmlNodes.put("</pickupDateTo>", "</PickupDateTo>");
        }

        if (method == GETPARCELSTATUSES) {
            xmlNodes.put("<parcelNumber>", "<ParcelNumber>");
            xmlNodes.put("</parcelNumber>", "</ParcelNumber>");
            xmlNodes.put("<returnPOD>", "<ReturnPOD>");
            xmlNodes.put("</returnPOD>", "</ReturnPOD>");
            xmlNodes.put("<languageIsoCode>", "<LanguageIsoCode>");
            xmlNodes.put("</languageIsoCode>", "</LanguageIsoCode>");
        }

        Set<String> xmlNodesKeys = xmlNodes.keySet();
        for (String key : xmlNodesKeys) {
            request = request.replace(key, xmlNodes.get(key));
        }

        if (method == PRINTLABELS || method == PREPARELABELS || method == GETPRINTEDLABELS) {
            request = request.replace("<" + method + "Request>", "<" + method + "Request xmlns=\"http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations\" xmlns:i=\"http://www.w3.org/2001/XMLSchema-instance\">");
        }

        if (method == GETPARCELSTATUSES || method == GETPARCELLIST) {
            request = request.replace("<" + method + "Request>", "<" + method + "Request xmlns=\"http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations\" xmlns:i=\"http://www.w3.org/2001/XMLSchema-instance\">");
        }

        return request;
    }

    /**
     * Prepare request for sending.
     *
     * @param request
     * @param method
     * @return
     */
    private static String PrepareRequestForSending(String request, String method) {
        request = ManageCommonXmlNodes(request);

        request = ManageXmlNodes(request, method);

        if (method == PRINTLABELS || method == PREPARELABELS) {
            request = request.replace("<code>PSD</code><PSDParameter><stringValue>2351-CSOMAGPONT</stringValue></PSDParameter>", "<Service><ADRParameter i:nil=\"true\"/><AOSParameter i:nil=\"true\"/><CS1Parameter i:nil=\"true\"/><Code>PSD</Code><DDSParameter i:nil=\"true\"/><DPVParameter i:nil=\"true\"/><FDSParameter i:nil=\"true\"/><FSSParameter i:nil=\"true\"/><INSParameter i:nil=\"true\"/><MMPParameter i:nil=\"true\"/><PSDParameter><IntegerValue i:nil=\"true\"/><StringValue>2351-CSOMAGPONT</StringValue></PSDParameter><SDSParameter i:nil=\"true\"/><SM1Parameter i:nil=\"true\"/><SM2Parameter i:nil=\"true\"/><SZLParameter i:nil=\"true\"/><Value i:nil=\"true\"/></Service>");
        }

        if (method == GETPARCELLIST) {
            request = request.replace("</PickupDateTo>", "</PickupDateTo><PrintDateFrom i:nil=\"true\"/><PrintDateTo i:nil=\"true\"/>");
        }

        return request;
    }

    /**
     * Get XML version of the object.
     *
     * @param request
     * @param method
     * @return
     */
    private static String GetXmlVersionOfTheObject(Object request, String method) {
        StringWriter sw = new StringWriter();
        String xmlContent = "";

        try {
            if (method == PRINTLABELS) {
                JAXBContext jaxbContext = JAXBContext.newInstance(PrintLabelsRequest.class);
                Marshaller marshaller = jaxbContext.createMarshaller();

                marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                JAXBElement<PrintLabelsRequest> jaxbElement = new JAXBElement<PrintLabelsRequest>(new QName("", method + "Request"), PrintLabelsRequest.class, (PrintLabelsRequest) request);

                marshaller.marshal(jaxbElement, sw);
            }

            if (method == PREPARELABELS) {
                JAXBContext jaxbContext = JAXBContext.newInstance(PrepareLabelsRequest.class);
                Marshaller marshaller = jaxbContext.createMarshaller();

                marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                JAXBElement<PrepareLabelsRequest> jaxbElement = new JAXBElement<PrepareLabelsRequest>(new QName("", method + "Request"), PrepareLabelsRequest.class, (PrepareLabelsRequest) request);

                marshaller.marshal(jaxbElement, sw);
            }

            if (method == GETPRINTEDLABELS) {
                JAXBContext jaxbContext = JAXBContext.newInstance(GetPrintedLabelsRequest.class);
                Marshaller marshaller = jaxbContext.createMarshaller();

                marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                JAXBElement<GetPrintedLabelsRequest> jaxbElement = new JAXBElement<GetPrintedLabelsRequest>(new QName("", method + "Request"), GetPrintedLabelsRequest.class, (GetPrintedLabelsRequest) request);

                marshaller.marshal(jaxbElement, sw);
            }

            if (method == GETPARCELLIST) {
                JAXBContext jaxbContext = JAXBContext.newInstance(GetParcelListRequest.class);
                Marshaller marshaller = jaxbContext.createMarshaller();

                marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                JAXBElement<GetParcelListRequest> jaxbElement = new JAXBElement<GetParcelListRequest>(new QName("", method + "Request"), GetParcelListRequest.class, (GetParcelListRequest) request);

                marshaller.marshal(jaxbElement, sw);
            }

            if (method == GETPARCELSTATUSES) {
                JAXBContext jaxbContext = JAXBContext.newInstance(GetParcelStatusesRequest.class);
                Marshaller marshaller = jaxbContext.createMarshaller();

                marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                JAXBElement<GetParcelStatusesRequest> jaxbElement = new JAXBElement<GetParcelStatusesRequest>(new QName("", method + "Request"), GetParcelStatusesRequest.class, (GetParcelStatusesRequest) request);

                marshaller.marshal(jaxbElement, sw);
            }

            xmlContent = sw.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return xmlContent;
    }

    /**
     * Get object from date string.
     *
     * @param dateString
     * @return
     * @throws java.text.ParseException
     */
    public static Calendar GetObjectFromDateString(String dateString) throws java.text.ParseException {
        SimpleDateFormat sDF = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");

        java.util.Date pickupDate = sDF.parse(dateString);
        Calendar pickupDateCalendar = Calendar.getInstance();
        pickupDateCalendar.setTime(pickupDate);

        return pickupDateCalendar;
    }

    /**
     * Get byte array of password.
     *
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static byte[] GetPasswordByteArray() throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        byte[] password = md.digest(_password.getBytes());
        return password;
    }

    /**
     * Get password byte array as string.
     *
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String GetPasswordByteArrayAsString() throws NoSuchAlgorithmException {
        byte[] password = GetPasswordByteArray();
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (byte b : password) {
            if (b < 0) {
                if (sb.chars().count() == 1) {
                    sb.append(UnsignedToBytes(b));
                } else {
                    sb.append("," + UnsignedToBytes(b));
                }
            } else {
                if (sb.chars().count() == 1) {
                    sb.append(b);
                } else {
                    sb.append("," + b);
                }
            }
        }
        sb.append("]");

        return sb.toString();
    }

    /**
     * UnsignedToBytes
     *
     * @param b
     * @return
     */
    public static int UnsignedToBytes(byte b) {
        return b & 0xFF;
    }

    /**
     * Get json from file.
     *
     * @param json
     * @return String
     * @throws ParseException
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static String GetJsonFromFile(String json) throws ParseException, FileNotFoundException, IOException {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader(json));
        JSONObject jsonObject = (JSONObject) object;
        return jsonObject.toString();
    }

    /**
     * Get response.
     *
     * @param method
     * @param request
     * @return String
     * @throws MalformedURLException
     * @throws IOException
     */
    public static String GetResponse(String method, String request, boolean isXmlFormat) throws MalformedURLException, IOException {
        String url = _url;
        url = url.replace("SERVICE_NAME", _serviceName);
        url = ((isXmlFormat == false) ? url + "json/" : url + "xml/") + method;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);

        if (isXmlFormat == false) {
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
        } else {
            httpURLConnection.setRequestProperty("Content-Type", "text/xml");
        }

        //Service calling:
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(request.getBytes("UTF-8"));
        outputStream.flush();
        outputStream.close();

        if (httpURLConnection.getResponseCode() != HttpURLConnection.HTTP_OK) {
            throw new RuntimeException("HTTP ERROR CODE: " + httpURLConnection.getResponseCode());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
        StringBuilder response = new StringBuilder("");
        String line = null;
        while ((line = reader.readLine()) != null) {
            response.append(line + "\n");
        }
        reader.close();

        httpURLConnection.disconnect();

        return response.toString();
    }

    /**
     * Write bytes to file.
     *
     * @param binaryFile
     * @param output
     */
    public static void WriteBytesToFile(byte[] binaryFile, String output) {
        FileOutputStream fileOuputStream = null;

        try {
            fileOuputStream = new FileOutputStream(output);
            fileOuputStream.write(binaryFile);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOuputStream != null) {
                try {
                    fileOuputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Preparing parcel data.
     *
     * @param clientNumber
     * @return Parcel[]
     * @throws java.text.ParseException
     */
    public static Parcel[] PrepareParcelData(int clientNumber) throws java.text.ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
        String dateInString = "2019-12-14 23:59:59";
        java.util.Date date = sdf.parse(dateInString);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        Parcel parcel = new Parcel();
        parcel.setClientNumber(clientNumber);
        parcel.setClientReference("TEST PARCEL");
        BigDecimal COD = new BigDecimal("0");
        parcel.setCODAmount(COD);
        parcel.setCODReference("COD REFERENCE");
        parcel.setContent("CONTENT");
        parcel.setCount(1);
        Address deliveryAddress = new Address();
        deliveryAddress.setContactName("Contact Name");
        deliveryAddress.setContactPhone("+36701234567");
        deliveryAddress.setContactEmail("something@anything.hu");
        deliveryAddress.setName("Delivery Address");
        deliveryAddress.setStreet("Eur�pa u.");
        deliveryAddress.setHouseNumber("2");
        deliveryAddress.setCity("Als�n�medi");
        deliveryAddress.setZipCode("2351");
        deliveryAddress.setCountryIsoCode("HU");
        deliveryAddress.setHouseNumberInfo("/b");
        parcel.setDeliveryAddress(deliveryAddress);
        Address pickupAddress = new Address();
        pickupAddress.setContactName("Contact Name");
        pickupAddress.setContactPhone("+36701234567");
        pickupAddress.setContactEmail("something@anything.hu");
        pickupAddress.setName("Pickup Address");
        pickupAddress.setStreet("Eur�pa u.");
        pickupAddress.setHouseNumber("2");
        pickupAddress.setCity("Als�n�medi");
        pickupAddress.setZipCode("2351");
        pickupAddress.setCountryIsoCode("HU");
        pickupAddress.setHouseNumberInfo("/a");
        parcel.setPickupAddress(pickupAddress);
        parcel.setPickupDate(calendar);
        Service service1 = new Service();
        service1.setCode("PSD");
        ServiceParameterStringInteger parameter1 = new ServiceParameterStringInteger();
        parameter1.setStringValue("2351-CSOMAGPONT");
        service1.setPSDParameter(parameter1);
        Service[] serviceList = new Service[1];
        serviceList[0] = service1;
        parcel.setServiceList(serviceList);

        Parcel[] parcelList = {parcel};

        return parcelList;
    }
}