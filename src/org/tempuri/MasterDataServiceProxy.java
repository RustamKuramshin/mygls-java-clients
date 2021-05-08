package org.tempuri;

public class MasterDataServiceProxy implements MasterDataService_PortType {
  private String _endpoint = null;
  private MasterDataService_PortType masterDataService_PortType = null;
  
  public MasterDataServiceProxy() {
    _initMasterDataServiceProxy();
  }
  
  public MasterDataServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMasterDataServiceProxy();
  }
  
  private void _initMasterDataServiceProxy() {
    try {
      masterDataService_PortType = (new MasterDataService_ServiceLocator()).getBasicHttpBinding_MasterDataService();
      if (masterDataService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)masterDataService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)masterDataService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (masterDataService_PortType != null)
      ((javax.xml.rpc.Stub)masterDataService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public MasterDataService_PortType getMasterDataService_PortType() {
    if (masterDataService_PortType == null)
      _initMasterDataServiceProxy();
    return masterDataService_PortType;
  }
  
  public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_MasterData.GetLocationsResponse getLocations(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_MasterData.GetLocationsRequest getLocationsRequest) throws java.rmi.RemoteException{
    if (masterDataService_PortType == null)
      _initMasterDataServiceProxy();
    return masterDataService_PortType.getLocations(getLocationsRequest);
  }
  
  public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_MasterData.GetDeliveryPointsResponse getDeliveryPoints(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_MasterData.GetDeliveryPointsRequest getDeliveryPointsRequest) throws java.rmi.RemoteException{
    if (masterDataService_PortType == null)
      _initMasterDataServiceProxy();
    return masterDataService_PortType.getDeliveryPoints(getDeliveryPointsRequest);
  }
  
  
}