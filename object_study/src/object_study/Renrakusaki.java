package object_study;

class Renrakusaki {
	private String adr;
	private String tel;
	public Renrakusaki( String adr0, String tel0) {
		adr = adr0;
		tel = tel0;
	}
	public void print() {
		System.out.println(adr + " " + tel);
	}
}
