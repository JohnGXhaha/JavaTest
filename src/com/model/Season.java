package com.model;

public enum Season {
	SPRING,SUNMMER,FAIL,WINTER;
	
	
	private String name;
	private String desc;

	public static void main(String[] args) {
		System.out.println(Season.values());
		for(Season s:Season.values()){
			System.out.println(s);
		}
		Season season=Enum.valueOf(Season.class, "WINTER");
		season.desc="真他妈冷";
		season.name="冬天";
		System.out.println(season+": 这个"+season.name+season.desc);
		System.out.println(season.toString());
	}
}

