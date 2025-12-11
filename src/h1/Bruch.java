package h1;

public class Bruch {
 public int nenner, zaehler;
 
 
 
 public Bruch(int zaehler, int nenner) {
	 this.nenner = nenner;
	 this.zaehler = zaehler;
	 
 }
 
 private int ggT(int x, int y) {
	 if(x<0) {
		 x = -x;
	 }
	 
	 if(y<0) {
		 y = -y;
	 }
	
	 if(x==y) {
		 return x;
	 }
	 
	 if(x>y) {
		 int r = x%y;
		 if (r==0) {
			 return y;
		 }
		 int r2 = y%r;
		 if (r2 == 0) {
			 return r;
		 }
		 while(r2>0) {
			 int rest = r%r2;
			 r = r2;
			 r2 = rest;	  
		 } 
		 return r;
		 }
	if(y>x) {
		int r = y%x;
		if (r == 0) {
			return x;
		}
		 int r2 = x%r;
		 if (r2 == 0) {
			 return r;
		 }
		 while(r2>0) {
			 int rest = r%r2;
			 r = r2;
			 r2 = rest;	  
		 } 
		 return r;
		
	}
	 
	 return 0;
 }
 
 public void shorten() {
	int ggt = ggT(zaehler, nenner);
	zaehler = zaehler/ggt;
	nenner = nenner/ggt;
	  
 }
 
 public boolean hasSameValueAs(Bruch b) {
	this.shorten();
	b.shorten();
	 if ((this.nenner == b.nenner) && (this.zaehler == b.zaehler)) {
		 return true;
	 } else {return false;}

 }
}
