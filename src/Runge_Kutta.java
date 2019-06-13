
public class Runge_Kutta 
{
	public static void main(String[] args) 
	{
		double y0=1,x0=0;
		double h=0.1,N=2;
		double x1=0,y1=0,K1,K2,K3,K4;
		for(int n=1;n<=N;n++)
		{
			x1=x0+h;
			K1=x0*y0;
			K2=((x0+h/2)*(y0+K1*h/2));
			K3=((x0+h/2)*(y0+K2*h/2));
			K4=((x1)*(y0+K3*h));
			y1=y0+(K1+2*K2+2*K3+K4)*h/6;
			if(n<N)
			{
				x0=x1;y0=y1;
			}
		}
		System.out.println(x1);
		System.out.println(y1);
	}
}
