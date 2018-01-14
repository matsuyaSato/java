package interfaceStudy3;

class Renrakusaki {
	protected String adr;
	protected String tel;

	public Renrakusaki(String adr0, String tel0){
		adr = adr0;
		tel = tel0;
	}

	public String getAdr() {
		return adr;
	}

	public void print() {
		System.out.println(adr + " " + tel );
	}
}
