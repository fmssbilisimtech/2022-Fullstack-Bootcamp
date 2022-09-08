package fifthweek;

/*----------------------------------------------------------------------------------------------------------------------
	Complex sınıfı
----------------------------------------------------------------------------------------------------------------------*/

public class ComplexApp {
    private static ComplexApp add(double re1, double im1, double re2, double im2)
    {
        return new ComplexApp(re1 + re2, im1 + im2);
    }

    private static ComplexApp subtract(double re1, double im1, double re2, double im2)
    {
        return add(re1, im1, -re2, -im2);
    }

    public double re;
    public double im;

    public ComplexApp()
    {

    }

    public ComplexApp(double re)
    {
        this.re = re;
    }

    public ComplexApp(double re, double im)
    {
        this.re = re;
        this.im = im;
    }

    public ComplexApp getConjugate()
    {
        ComplexApp z = new ComplexApp();

        z.re = re;
        z.im = -im;

        return z;
    }

    public double getNorm()
    {
        return Math.sqrt(re * re + im * im);
    }

    //add
    public static ComplexApp add(double a, ComplexApp z)
    {
        return add(a, 0, z.re, z.im);
    }

    public ComplexApp add(ComplexApp z)
    {
        return add(re, im, z.re, z.im);
    }

    public ComplexApp add(double a)
    {
        return add(re, im, a, 0);
    }

    //subtract
    public static ComplexApp subtract(double a, ComplexApp z)
    {
        return subtract(a, 0, z.re, z.im);
    }

    public ComplexApp subtract(ComplexApp z)
    {
        return subtract(re, im, z.re, z.im);
    }

    public ComplexApp subtract(double a)
    {
        return subtract(re, im, a, 0);
    }

    public void offset(double dxy)
    {
        this.offset(dxy, dxy);
    }

    public void offset(double dx, double dy)
    {
        re += dx;
        im += dy;
    }

    public String toString()
    {
        return String.format("|%.2f + %.2f * i| = %f", re, im, this.getNorm());
    }
}
