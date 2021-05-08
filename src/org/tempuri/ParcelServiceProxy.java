package org.tempuri;

public class ParcelServiceProxy implements ParcelService_PortType {
  private String _endpoint = null;
  private ParcelService_PortType parcelService_PortType = null;
  
  public ParcelServiceProxy() {
    _initParcelServiceProxy();
  }
  
  public ParcelServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initParcelServiceProxy();
  }
  
  private void _initParcelServiceProxy() {
    try {
      parcelService_PortType = (new ParcelService_ServiceLocator()).getBasicHttpBinding_ParcelService();
      if (parcelService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)parcelService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)parcelService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (parcelService_PortType != null)
      ((javax.xml.rpc.Stub)parcelService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ParcelService_PortType getParcelService_PortType() {
    if (parcelService_PortType == null)
      _initParcelServiceProxy();
    return parcelService_PortType;
  }
  
  public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.DeleteLabelsResponse deleteLabels_20190201(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.DeleteLabelsRequest deleteLabelsRequest) throws java.rmi.RemoteException{
    if (parcelService_PortType == null)
      _initParcelServiceProxy();
    return parcelService_PortType.deleteLabels_20190201(deleteLabelsRequest);
  }
  
  public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.GetPrintDataResponse getPrintData_20190201(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.GetPrintDataRequest getPrintDataRequest) throws java.rmi.RemoteException{
    if (parcelService_PortType == null)
      _initParcelServiceProxy();
    return parcelService_PortType.getPrintData_20190201(getPrintDataRequest);
  }
  
  public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.GetPrintedLabelsResponse getPrintedLabels_20190201(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.GetPrintedLabelsRequest getPrintedLabelsRequest) throws java.rmi.RemoteException{
    if (parcelService_PortType == null)
      _initParcelServiceProxy();
    return parcelService_PortType.getPrintedLabels_20190201(getPrintedLabelsRequest);
  }
  
  public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.PrepareLabelsResponse prepareLabels_20190201(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.PrepareLabelsRequest prepareLabelsRequest) throws java.rmi.RemoteException{
    if (parcelService_PortType == null)
      _initParcelServiceProxy();
    return parcelService_PortType.prepareLabels_20190201(prepareLabelsRequest);
  }
  
  public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.PrintLabelsResponse printLabels_20190201(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.PrintLabelsRequest printLabelsRequest) throws java.rmi.RemoteException{
    if (parcelService_PortType == null)
      _initParcelServiceProxy();
    return parcelService_PortType.printLabels_20190201(printLabelsRequest);
  }
  
  public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations.ModifyCODResponse modifyCOD_20190201(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations.ModifyCODRequest modifyCODRequest) throws java.rmi.RemoteException{
    if (parcelService_PortType == null)
      _initParcelServiceProxy();
    return parcelService_PortType.modifyCOD_20190201(modifyCODRequest);
  }
  
  public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.DeleteLabelsResponse deleteLabels(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.DeleteLabelsRequest deleteLabelsRequest) throws java.rmi.RemoteException{
    if (parcelService_PortType == null)
      _initParcelServiceProxy();
    return parcelService_PortType.deleteLabels(deleteLabelsRequest);
  }
  
  public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.GetPrintDataResponse getPrintData(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.GetPrintDataRequest getPrintDataRequest) throws java.rmi.RemoteException{
    if (parcelService_PortType == null)
      _initParcelServiceProxy();
    return parcelService_PortType.getPrintData(getPrintDataRequest);
  }
  
  public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.GetPrintedLabelsResponse getPrintedLabels(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.GetPrintedLabelsRequest getPrintedLabelsRequest) throws java.rmi.RemoteException{
    if (parcelService_PortType == null)
      _initParcelServiceProxy();
    return parcelService_PortType.getPrintedLabels(getPrintedLabelsRequest);
  }
  
  public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.PrepareLabelsResponse prepareLabels(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.PrepareLabelsRequest prepareLabelsRequest) throws java.rmi.RemoteException{
    if (parcelService_PortType == null)
      _initParcelServiceProxy();
    return parcelService_PortType.prepareLabels(prepareLabelsRequest);
  }
  
  public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.PrintLabelsResponse printLabels(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.PrintLabelsRequest printLabelsRequest) throws java.rmi.RemoteException{
    if (parcelService_PortType == null)
      _initParcelServiceProxy();
    return parcelService_PortType.printLabels(printLabelsRequest);
  }
  
  public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations.ModifyCODResponse modifyCOD(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations.ModifyCODRequest modifyCODRequest) throws java.rmi.RemoteException{
    if (parcelService_PortType == null)
      _initParcelServiceProxy();
    return parcelService_PortType.modifyCOD(modifyCODRequest);
  }
  
  public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations.GetParcelListResponse getParcelList(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations.GetParcelListRequest getParcelListRequest) throws java.rmi.RemoteException{
    if (parcelService_PortType == null)
      _initParcelServiceProxy();
    return parcelService_PortType.getParcelList(getParcelListRequest);
  }
  
  public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations.GetParcelStatusResponse getParcelStatuses(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations.GetParcelStatusesRequest getParcelStatusesRequest) throws java.rmi.RemoteException{
    if (parcelService_PortType == null)
      _initParcelServiceProxy();
    return parcelService_PortType.getParcelStatuses(getParcelStatusesRequest);
  }
  
  
}