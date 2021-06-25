package com.citi.trade.util;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SectorCompanyList {

	public static Map<String,List<String>> sectorWiseCompany()
	{
		Map<String, List<String>> sectorCompanyList = Map.ofEntries(
				new AbstractMap.SimpleEntry<String, List<String>>("Automobile",
						new ArrayList<>(Arrays.asList("BAJAJ-AUTO.NS", "EICHERMOT.NS", "HEROMOTOCO.NS", "M&M.NS",
								"MARUTI.NS", "TATAMOTORS.NS","ASHOKLEY.NS","EICHERMOT.NS","AMARAJABAT.NS","TVSMOTOR.NS","MOTHERSUMI.NS",
								"MRF.NS","BOSCHLTD.NS","BALKRISIND.NS","BAJAJ-AUTO.NS","EXIDEIND.NS","TATAMOTORS.NS","BHARATFORG.NS"	
								))),
				new AbstractMap.SimpleEntry<String, List<String>>("Banking",
						new ArrayList<>(Arrays.asList("AXISBANK.NS", "HDFCBANK.NS", "ICICIBANK.NS",
								"KOTAKBANK.NS", "SBIN.NS","BANKBARODA.NS","FEDERALBNK.NS","UNIONBANK.NS","INDIANB.NS",
								"BANKINDIA.NS","CANBK.NS","IOB.NS","MAHABANK.NS","UCOBANK.NS","J&KBANK.NS","YESBANK.NS",
								"RBLBANK.NS"))),
				new AbstractMap.SimpleEntry<String, List<String>>("FMCG",
						new ArrayList<>(Arrays.asList("EMAMILTD.NS","PGHH.NS","TATACONSUM.NS","BRITANNIA.NS","GODREJCP.NS","COLPAL.NS",
								"NESTLEIND.NS","DABUR.NS","JUBLFOOD.NS","MARICO.NS","HINDUNILVR.NS","ITC.NS","MCDOWELL-N.NS","VBL.NS","UBL.NS"))),
				
				new AbstractMap.SimpleEntry<String, List<String>>("Metal",
						new ArrayList<>(Arrays.asList("RATNAMANI.NS","HINDALCO.NS","COALINDIA.NS","VEDL.NS","NATIONALUM.NS","APLAPOLLO.NS",
								"MOIL.NS","TATASTEEL.NS","JINDALSTEL.NS","HINDZINC.NS","JSWSTEEL.NS","WELCORP.NS","SAIL.NS","ADANIENT.NS","NMDC.NS"))),
				
				new AbstractMap.SimpleEntry<String, List<String>>("Pharma",
						new ArrayList<>(Arrays.asList("CIPLA.NS","SUNPHARMA.NS","DRREDDY.NS","LUPIN.NS","TORNTPHARM.NS","BIOCON.NS","ALKEM.NS",
								"CADILAHC.NS","AUROPHARMA.NS","DIVISLAB.NS","PFIZER.NS","GLAXO.NS","PGHL.NS","ASTRAZEN.NS","NATCOPHARM.NS",
								"APLLTD.NS","AJANTPHARM.NS","STAR.NS"))),
				
				new AbstractMap.SimpleEntry<String, List<String>>("Cement",
						new ArrayList<>(Arrays.asList("ASIANPAINT.NS", "BRITANNIA.NS", "HINDUNILVR.NS", "ITC.NS",
								"NESTLEIND.NS", "TITAN.NS","ULTRACEMCO.NS"))),
				
				new AbstractMap.SimpleEntry<String, List<String>>("Energy",
						new ArrayList<>(Arrays.asList("BPCL.NS", "GAIL.NS", "IOC.NS", "ONGC.NS", "RELIANCE.NS", "NTPC.NS",
								"POWERGRID.NS","ADANIGREEN.NS","HINDPETRO.NS","TATAPOWER.NS"))),
				
				new AbstractMap.SimpleEntry<String, List<String>>("Information Technology",
						new ArrayList<>(Arrays.asList("HCLTECH.NS", "INFY.NS", "TCS.NS", "TECHM.NS", "WIPRO.NS","TATAELXSI.NS","OFSS.NS",
								"LTI.NS","MINDTREE.NS","TECHM.NS","MPHASIS.NS","COFORGE.NS"))));

		return sectorCompanyList;


	}


}
