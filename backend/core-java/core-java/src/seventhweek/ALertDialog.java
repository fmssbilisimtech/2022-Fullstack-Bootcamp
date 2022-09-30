package seventhweek;

import util.Console;

public class ALertDialog { }
/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte AlertDialog nesnesinin yaratiılması onun  içerisinde bulunan Builder isimli bir sınıf kullanılarak
    yapılmıştır. Böylece AlertDialog sınıfını kullanan programcı (client code) daha yalın ve esnek bir şekilde kod
    yazabilmektedir. Builder sınıfı zincir çağrılara uygun (fluent) şekilde yazılmıştır. Örnekte bir tasarım kalıbı
    olan "builder", "fluent" ile kullanıldığından "fluent builder" da denir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Icon icon = new Icon("logo.jpg");
//
//        var dlg = new AlertDialog.Builder()
//                .setTitle("Dikkat")
//                .setText("Çıkmak istediğinize emin misiniz?")
//                .setPositiveButtonText("Evet")
//                .setIcon(icon)
//                .setNegativeButtonText("Hayır")
//                .build();
//
//        dlg.show();
//    }
//}
//
//class Icon {
//    public String filename;
//
//    public Icon(String filename)
//    {
//        this.filename = filename;
//    }
//    //
//}
//
//class AlertDialog {
//    private String m_title;
//    private String m_text;
//    private Icon m_icon;
//    private String m_positiveButtonText;
//    private String m_negativeButtonText;
//    //...
//
//    public static class Builder {
//        private final AlertDialog m_alertDialog = new AlertDialog();
//
//        public Builder setTitle(String title)
//        {
//            m_alertDialog.m_title = title;
//
//            return this;
//        }
//
//        public Builder setText(String text)
//        {
//            m_alertDialog.m_text = text;
//
//            return this;
//        }
//
//        public Builder setIcon(Icon icon)
//        {
//            m_alertDialog.m_icon = icon;
//
//            return this;
//        }
//
//        public Builder setPositiveButtonText(String text)
//        {
//            m_alertDialog.m_positiveButtonText = text;
//
//            return this;
//        }
//
//        public Builder setNegativeButtonText(String text)
//        {
//            m_alertDialog.m_negativeButtonText = text;
//
//            return this;
//        }
//
//        public AlertDialog build()
//        {
//            return m_alertDialog;
//        }
//    }
//
//    private AlertDialog()
//    {
//        m_title = "";
//        m_text = "";
//        m_icon = null;
//        m_positiveButtonText = "YES";
//        m_negativeButtonText = "NO";
//    }
//
//    public void show()
//    {
//        Console.writeLine("Title: %s", m_title);
//        Console.writeLine("Text: %s", m_text);
//        if (m_icon != null)
//            Console.writeLine("Icon: %s", m_icon.filename);
//
//        Console.writeLine("Positive Button Text: %s", m_positiveButtonText);
//        Console.writeLine("Negative Button Text: %s", m_negativeButtonText);
//    }
//}
