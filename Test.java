public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// 1 List all carriers
			// String urlStr = null;
			// String requestData=null;
			// String result = new Tracker().orderOnlineByJson(requestData,urlStr,"carriers");
			// System.out.println("result======="+result);

			// 2 detect a carriers by tracking number
			// String urlStr = null;
			// String requestData="{\"tracking_number\":\"CY280214949DE\"}";
			// String result = new Tracker().orderOnlineByJson(requestData,urlStr,"carriers/detect");
			// System.out.println("result======="+result);

			// 3 create a tracking number
			 String	urlStr =null;
			 String requestData= "{\"tracking_number\": \"CY280214949DE\",\"carrier_code\":\"dhl-germany\",\"title\":\"4PX page\",\"customer_name\":\"trackingmore user\",\"customer_email\":\"service@trackingmore.com\",\"order_id\":\"#123\",\"order_create_time\":\"2018/09/08 16:51\",\"destination_code\":\"US\",\"tracking_ship_date\":\"20180908\",\"tracking_postal_code\":\"12201\",\"lang\":\"en\",\"logistics_channel\":\"API TEST\"}";
			 String result = new Tracker().orderOnlineByJson(requestData,urlStr,"post");
			 System.out.println("result======="+result);
			
			// 4 List all trackings
			// String	urlStr ="?page=1&limit=100&created_at_min=0&created_at_max=0&update_time_min=0&update_time_max=0&order_created_time_min=0&order_created_time_max=0&numbers=CY280214949DE&orders=&lang=cn";
			// String requestData=null;
			// String result = new Tracker().orderOnlineByJson(requestData,urlStr,"get");
			// System.out.println("result======="+result);

			// 5 Get tracking results of a single tracking.
			// String	urlStr ="/dhl-germany/CY280214949DE/en";
			// String requestData=null;
			// String result = new Tracker().orderOnlineByJson(requestData,urlStr,"codeNumberGet");
			// System.out.println("result======="+result);
			
			// 6 create muti tracking number
			// String	urlStr =null;
			// String requestData="[{\"tracking_number\": \"CY280214949DE\",\"carrier_code\":\"dhl-germany\",\"title\":\"4PX page\",\"customer_name\":\"trackingmore user\",\"customer_email\":\"service@trackingmore.com\",\"order_id\":\"#123\",\"order_create_time\":\"2018/09/08 16:51\",\"destination_code\":\"US\",\"tracking_ship_date\":\"20180908\",\"tracking_postal_code\":\"12201\",\"lang\":\"en\",\"logistics_channel\":\"API TEST\"},{\"tracking_number\": \"LZ448865302CN\",\"carrier_code\":\"china-ems\",\"title\":\"4PX page\",\"customer_name\":\"trackingmore user\",\"customer_email\":\"service@trackingmore.com\",\"order_id\":\"#123\",\"order_create_time\":\"2018/09/08 16:51\",\"destination_code\":\"US\",\"tracking_ship_date\":\"20180908\",\"tracking_postal_code\":\"12201\",\"lang\":\"en\",\"logistics_channel\":\"API TEST\"}]";
			// String result = new Tracker().orderOnlineByJson(requestData,urlStr,"batch");
			// System.out.println("result======="+result);
			
			// 7 Update Tracking item
			// String	urlStr ="/dhl-germany/CY280214949DE";
			// String requestData="{\"title\": \"4PX page\",\"customer_name\":\"trackingmore user\",\"customer_email\":\"service@trackingmore.com\",\"order_id\":\"#123\",\"logistics_channel\":\"API TEST\",\"customer_phone\":\"+86 13142052920\",\"destination_code\":\"US\",\"status\":\"7\"}";
			// String result = new Tracker().orderOnlineByJson(requestData,urlStr,"codeNumberPut");
			// System.out.println("result======="+result);
			
			// 8 Delete a tracking item
			// String	urlStr ="/dhl-germany/CY280214949DE";
			// String requestData=null;
			// String result = new Tracker().orderOnlineByJson(requestData,urlStr,"codeNumberDelete");
			// System.out.println("result======="+result);
			
			// 9 Get realtime tracking results of a single tracking 
			// String	urlStr =null;
			// String requestData="{\"tracking_number\": \"CY280214949DE\",\"carrier_code\":\"dhl-germany\",\"destination_code\":\"US\",\"tracking_ship_date\": \"20180908\",\"tracking_postal_code\":\"12201\",\"specialNumberDestination\":\"UK\",\"order\":\"#123\",\"order_create_time\":\"2018/09/08 16:51\",\"lang\":\"en\"}";
			// String result = new Tracker().orderOnlineByJson(requestData,urlStr,"realtime");
			// System.out.println("result======="+result);

			// 10 Modify courier code
			// String	urlStr =null;
			// String requestData="{\"tracking_number\": \"CY280214949DE\",\"carrier_code\":\"dhl-germany\",\"update_carrier_code\":\"china-ems\"}";
			// String result = new Tracker().orderOnlineByJson(requestData,urlStr,"update");
			// System.out.println("result======="+result);

			// 11 Get user info
			// String	urlStr =null;
			// String requestData=null;
			// String result = new Tracker().orderOnlineByJson(requestData,urlStr,"getuserinfo");
			// System.out.println("result======="+result);

			// 12 Get status number
			// String	urlStr =null;
			// String requestData=null;
			// String result = new Tracker().orderOnlineByJson(requestData,urlStr,"getstatusnumber");
			// System.out.println("result======="+result);

			// 13 Set number not update
			// String	urlStr =null;
			// String requestData= "[{\"tracking_number\":\"CY280214949DE\",\"carrier_code\":\"dhl-germany\"},{\"tracking_number\":\"LZ448865302CN\",\"carrier_code\":\"china-ems\"}]";
			// String result = new Tracker().orderOnlineByJson(requestData,urlStr,"notupdate");
			// System.out.println("result======="+result);

			// 14 Get remote iterm results
			// String	urlStr =null;
			// String requestData= "[{\"country\":\"CN\",\"postcode\":\"400422\"},{\"country\":\"CN\",\"postcode\":\"412000\"}]";
			// String result = new Tracker().orderOnlineByJson(requestData,urlStr,"remote");
			// System.out.println("result======="+result);

			// 15 Get cost time iterm results
			// String	urlStr =null;
			// String requestData= "[{\"carrier_code\":\"dhl-germany\",\"destination\":\"US\",\"original\":\"CN\"},{\"carrier_code\":\"china-ems\",\"destination\":\"US\",\"original\":\"CN\"}]";
			// String result = new Tracker().orderOnlineByJson(requestData,urlStr,"costtime");
			// System.out.println("result======="+result);

			// 16 Delete multiple tracking item
			// String	urlStr =null;
			// String requestData= "[{\"tracking_number\":\"CY280214949DE\",\"carrier_code\":\"dhl-germany\"},{\"tracking_number\":\"LZ448865302CN\",\"carrier_code\":\"china-ems\"}]";
			// String result = new Tracker().orderOnlineByJson(requestData,urlStr,"delete");
			// System.out.println("result======="+result);

			// 17 Update multiple Tracking item
			// String	urlStr =null;
			// String requestData="[{\"tracking_number\":\"CY280214949DE\",\"carrier_code\":\"dhl-germany\",\"title\": \"4PX page\",\"customer_name\":\"trackingmore user\",\"customer_email\":\"service@trackingmore.com\",\"order_id\":\"#123\",\"logistics_channel\":\"API TEST\",\"destination_code\":\"US\",\"status\":\"7\"},{\"tracking_number\":\"LZ448865302CN\",\"carrier_code\":\"china-ems\",\"title\": \"4PX page\",\"customer_name\":\"trackingmore user\",\"customer_email\":\"service@trackingmore.com\",\"order_id\":\"#123\",\"logistics_channel\":\"API TEST\",\"destination_code\":\"US\",\"status\":\"7\"}]";
			// String result = new Tracker().orderOnlineByJson(requestData,urlStr,"updatemore");
			// System.out.println("result======="+result);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}