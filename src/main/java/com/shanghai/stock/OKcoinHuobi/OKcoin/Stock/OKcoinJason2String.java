package com.shanghai.stock.OKcoinHuobi.OKcoin.Stock;

import org.json.JSONArray;
import org.json.JSONObject;

import com.shanghai.stock.OKcoinHuobi.OKcoin.Util.OKLtcTopSellBuyData;

public class OKcoinJason2String {

	public static OKLtcTopSellBuyData Jason2Data(String jasonString){
		OKLtcTopSellBuyData data = new OKLtcTopSellBuyData();
		JSONObject jsonObject = new JSONObject(jasonString);
		JSONArray asks = jsonObject.getJSONArray("asks");
		JSONArray bids = jsonObject.getJSONArray("bids");
		JSONArray ask = asks.getJSONArray(asks.length()-1);
		JSONArray bid = bids.getJSONArray(0);
		data.setSellPrice(Float.valueOf(String.valueOf(ask.get(0))));
		data.setSellAmount(Float.valueOf(String.valueOf(ask.get(1))));
		data.setBuyPrice(Float.valueOf(String.valueOf(bid.get(0))));
		data.setBuyAmount(Float.valueOf(String.valueOf(bid.get(1))));
		return data;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jasonString= "{\"asks\":[[29.66,1200],[29.65,10.4],[29.63,10.4],[29.61,49.22],[29.6,1524.707],[29.59,620.4],[29.58,10],[29.57,131.619],[29.55,251.213],[29.54,30],[29.53,10.4],[29.52,13.55],[29.51,15.4],[29.5,7215.77],[29.49,1766.596],[29.48,36.75],[29.47,10.4],[29.45,79.4],[29.43,10.9],[29.42,757.888],[29.41,13.4],[29.4,23.1],[29.39,529.4],[29.37,10.4],[29.35,320.4],[29.34,780],[29.33,10.4],[29.32,96.726],[29.31,13.4],[29.3,12181.268],[29.29,1651.394],[29.28,110],[29.27,10.4],[29.26,350.533],[29.25,572.4],[29.23,30.4],[29.21,82.353],[29.2,698.62],[29.19,545.103],[29.17,10.4],[29.16,13.717],[29.15,10.65],[29.14,43.726],[29.13,10.4],[29.12,24.236],[29.11,43.4],[29.1,11838.444],[29.09,521.4],[29.08,3876.596],[29.07,10.4],[29.05,3024.124],[29.03,140.4],[29.02,141],[29.01,113.4],[29,49146.168],[28.99,1637.605],[28.98,3716.433],[28.97,10.4],[28.96,591],[28.95,73.4],[28.93,40.4],[28.92,22],[28.91,741.992],[28.9,23105.368],[28.89,3363.99],[28.88,11939.23],[28.87,130.4],[28.86,2248.31],[28.85,160.4],[28.84,40],[28.83,510.4],[28.82,90],[28.81,13.4],[28.8,24494.95],[28.79,826.4],[28.78,20.19],[28.77,1741.5],[28.76,61.149],[28.75,1829.69],[28.73,192.4],[28.72,140],[28.71,113.4],[28.7,2233.45],[28.69,1297.003],[28.68,360],[28.67,10.4],[28.66,1011.549],[28.65,3565.4],[28.64,9.8],[28.63,16.2],[28.62,1417.283],[28.61,13.4],[28.6,11685.993],[28.59,617.4],[28.58,3383.029],[28.57,10.4],[28.56,1183.627],[28.55,1226.976],[28.53,48.2],[28.52,24],[28.51,18.2],[28.5,37023.967],[28.49,545.684],[28.48,5779],[28.47,6802.222],[28.46,616.228],[28.45,884.014],[28.44,713.459],[28.43,90.2],[28.42,900.698],[28.41,448.2],[28.4,4028.342],[28.39,548.313],[28.38,313.757],[28.37,18.2],[28.36,445],[28.35,2215.044],[28.34,5245.023],[28.33,510.071],[28.32,3768.641],[28.31,7358.791],[28.3,7976.959],[28.29,1368.1],[28.28,4654.792],[28.27,561.745],[28.26,914.1],[28.25,906.1],[28.24,1169.567],[28.23,1343.224],[28.22,108.1],[28.21,963.5],[28.2,9161.032],[28.19,837.4],[28.18,29686.692],[28.17,453.129],[28.16,6529.8],[28.15,7250.344],[28.14,2187.714],[28.13,833.321],[28.12,643.057],[28.11,1089.499],[28.1,4297.325],[28.09,554.4],[28.08,609.2],[28.07,3661.855],[28.06,435],[28.05,767.341],[28.04,21.9],[28.03,543.3],[28.02,728.029],[28.01,518.299],[28,22349.131],[27.99,1364.802],[27.98,1442.965],[27.97,8668.3],[27.96,801.905],[27.95,73.3],[27.94,31.9],[27.93,709.3],[27.92,5],[27.91,579.02],[27.9,13176.563],[27.89,1570.071],[27.88,4320.1],[27.87,75.841],[27.86,775.1],[27.85,2627.5],[27.84,646.368],[27.83,1337.1],[27.82,399.609],[27.81,572.419],[27.8,746.294],[27.79,3140.517],[27.78,3049.616],[27.77,3108.2],[27.76,4949.226],[27.75,3592.977],[27.74,7280.3],[27.73,446.1],[27.72,299.951],[27.71,567.4],[27.7,3228.542],[27.69,685],[27.68,1070.486],[27.67,1344.5],[27.66,694.158],[27.65,1001.828],[27.64,124.358],[27.63,1378.4],[27.62,726.315],[27.61,893],[27.6,9409.035],[27.59,1563.625],[27.58,1297.632],[27.57,497.281],[27.56,15278.4],[27.55,2526.678],[27.54,680.087],[27.53,3234.6],[27.52,3604.206]],\"bids\":[[27.51,374.198],[27.5,404.145],[27.49,2036.877],[27.48,2156.68],[27.47,397.1],[27.46,953.604],[27.45,1156.055],[27.44,1821.6],[27.43,779.016],[27.42,41.1],[27.41,537],[27.4,9907.999],[27.39,829.808],[27.38,375.55],[27.37,240.259],[27.36,4482.093],[27.35,604.697],[27.34,160.749],[27.33,1574.609],[27.32,223.959],[27.31,877.4],[27.3,4388.973],[27.29,6177.901],[27.28,7352.332],[27.27,11277.5],[27.26,528.1],[27.25,23893.811],[27.24,375.17],[27.23,492.4],[27.22,1101],[27.21,492.9],[27.2,4728.558],[27.19,960.4],[27.18,733.893],[27.17,865.953],[27.16,1847],[27.15,1649.977],[27.14,360.044],[27.13,166.4],[27.12,999],[27.11,20718.9],[27.1,20428.776],[27.09,1040.454],[27.08,1141],[27.07,4506.4],[27.06,441.159],[27.05,843.368],[27.04,1151.473],[27.03,585.254],[27.02,6234],[27.01,25995.127],[27,60583.534],[26.99,770.49],[26.98,346],[26.97,418.4],[26.96,1025.04],[26.95,56.4],[26.94,510.214],[26.93,786.4],[26.92,360],[26.91,20386.4],[26.9,240.261],[26.89,540.4],[26.88,131],[26.87,340.4],[26.86,3655.536],[26.85,920.919],[26.84,330],[26.83,370.4],[26.82,330],[26.81,345.4],[26.8,13971.87],[26.79,545.4],[26.78,323.471],[26.77,450.4],[26.76,531.524],[26.75,8216.924],[26.74,8050],[26.73,6110.4],[26.72,480],[26.71,7110.4],[26.7,768.266],[26.69,552.4],[26.68,620.06],[26.67,226.176],[26.66,551],[26.65,1160.4],[26.63,500.4],[26.62,533.131],[26.61,1488.841],[26.6,1462.186],[26.59,1680.657],[26.58,1167.778],[26.57,3068.679],[26.56,710],[26.55,183.4],[26.54,1576.42],[26.53,639.535],[26.52,30],[26.51,8146.973],[26.5,37313.588],[26.49,1056.4],[26.47,10.4],[26.45,1782.308],[26.44,200],[26.43,10.4],[26.42,573.145],[26.41,10.4],[26.4,27876.529],[26.39,540.4],[26.38,1948],[26.37,25.4],[26.36,900],[26.35,10179.365],[26.34,20],[26.33,471.406],[26.32,142],[26.31,4861.246],[26.3,3917.434],[26.29,525.197],[26.27,10.4],[26.26,21.3],[26.25,180.4],[26.23,506.4],[26.22,300],[26.21,155.4],[26.2,4121.835],[26.19,827.944],[26.18,2192.596],[26.17,10.4],[26.15,1143.737],[26.13,134.798],[26.12,1835.132],[26.11,202.905],[26.1,13503.753],[26.09,103.422],[26.08,15],[26.07,10.4],[26.06,803],[26.05,162.4],[26.04,50],[26.03,1361.91],[26.02,245.174],[26.01,5971.961],[26,34143.209],[25.99,10.4],[25.98,300],[25.97,10.4],[25.96,121.543],[25.95,425.459],[25.93,10.4],[25.92,132.17],[25.91,28.651],[25.9,268.674],[25.89,10.817],[25.88,1908],[25.87,16.02],[25.86,10],[25.85,109.084],[25.83,10.5],[25.81,13.4],[25.8,8741.882],[25.79,10.4],[25.78,340],[25.77,26.4],[25.76,92.531],[25.75,10.4],[25.74,256.062],[25.73,20010.4],[25.72,158.929],[25.71,13.205],[25.7,338.184],[25.69,47.823],[25.68,370],[25.67,10.4],[25.66,300],[25.65,10010.4],[25.64,384.271],[25.63,86.9],[25.62,349.15],[25.61,210.4],[25.6,2726.688],[25.59,10.4],[25.58,354.7],[25.57,11.4],[25.56,8.451],[25.55,510.247],[25.54,1100.359],[25.53,210.5],[25.52,86.408],[25.51,5013.368],[25.5,13359.018],[25.49,27.4],[25.48,291],[25.47,526.652],[25.45,173.9],[25.44,81.194],[25.43,8540.372],[25.41,10.4],[25.4,160.175]]}";
		//OKLtcTopSellBuyData data = new OKLtcTopSellBuyData();
		OKLtcTopSellBuyData data = new OKLtcTopSellBuyData();
		data = OKcoinJason2String.Jason2Data(jasonString);
		System.out.println("top_ask_price:"+data.getSellPrice());
		System.out.println("top_ask_amount:"+data.getSellAmount());
		System.out.println("top_bid_price:"+data.getBuyPrice());
		System.out.println("top_bid_amount:"+data.getBuyAmount());
		//JSONObject ask = asks.getJSONObject(asks.length()-1);
		//JSONObject bid = bids.getJSONObject(0);

	}

}