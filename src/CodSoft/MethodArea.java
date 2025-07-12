package CodSoft;

public class MethodArea {
	
	public double circle(double r,double pi) {
		return r*r*pi;
	}
	
	public double triangle(double h,double b) {
		return b*h*0.5;
	}	
	
	public double rectangle(double w,double l) {
		return w*l;
	}
	public static void main(String[] args) {
		MethodArea methodArea=new MethodArea();
		double a= methodArea.circle(3, 3.14);
		double b= methodArea.triangle(3, 4);
		double c= methodArea.rectangle(4, 8);
		System.out.println("circle :"+a+" // "+"Triangle :"+b+" // "+"rectangle :"+c);
	}
}
