
public class Trinagolo {
private float base;
private float altezza;



public float getBase() {
	return base;
}


public void setBase(float base) {
	this.base = base;
}


public float getAltezza() {
	return altezza;
}


public void setAltezza(float altezza) {
	this.altezza = altezza;
}



public String toString() {
	return "Trinagolo [base=" + base + ", altezza=" + altezza + "]";
}


public Trinagolo(float base, float altezza) {
	this.base = base;
	this.altezza = altezza;
}


}
