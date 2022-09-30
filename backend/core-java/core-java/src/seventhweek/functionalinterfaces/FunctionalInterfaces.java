package seventhweek.functionalinterfaces;

public class FunctionalInterfaces {
}

/*----------------------------------------------------------------------------------------------------------------------
    Java 8 ile birlikte java.util.function paketine bir grup fonksiyonel arayüz eklenmiştir. Bu arayüzler yine Java 8 ile
    eklenen "Stream API (Application Programming Interface)" tarafından kullanılmaktadır. Stream API Java'da programlama
    modelini geliştirmiştir ve yerinde olarak kullanılmalıdır. Bu konu ileride detaylı bir biçimde ele alınacaktır.
    Şüphesiz eklenen fonksiyonel arayüzler sadece Stream API ile kullanılmaz. Programcı kendi tasarladığı sınıflarda
    ve metotlarda da kullanabilir. Ayrıca Java 8 ile eklenen bu arayüzler başka sınıflar tarafından da kullanılmaktadır.

    java.util.function paketi içerisinde bulunan bu arayüzler basitçe şu şekilde gruplanabilir:

    1. Function arayüzleri: Bu arayüzler bir ya da iki giriş alan ve bir sonuç üretilmesine yönelik işlemlerde kullanılır.
    Bu arayüzlerin en geneli Function ve BiFunction arayüzleridir. Function<T, R> arayüzü T türünden bir giriş alan ve R
    türünden bir geri dönüş değere sahip apply isimli abstract bir metoda sahiptir. BiFunction<T, U, R> arayüzü ise
    T ve U türünden iki tane parametresi olan ve R türünden geri dönüş değerine sahip abstract metoda sahiptir. Bu arayüzlerin
    temel türler için olan karşılkları da vardır. Örneğin, InFunction<R> arayüzü int alan ve R türüne dönen abstract bir
    metoda sahiptir.

    2. Operator arayüzleri: Bu arayüzler bir yada iki girişe göre bir işlem yapan ve sonuç üreten durumlarda kullanılır.
    Aslında Function arayüzlerinin daha özel biçimleridir. Bu arayüzler de BinaryOperator ve UnaryOperator olarak iki
    gruba ayrılır. Bu arayüzler bir ya da iki operand'lı işlemler için kullanılır. Bu arayüzler Function arayüzlerinden
    farklı olarak tek tür ile işlem yapar. Yani örneğin BinaryOperator<T> için iki tane T türünden parametreli ve T
    türüne geri dönen abstract bir metot vardır. UnaryOperator<T> arayüzü Function<T, T> açılımından, BinaryOperator
    arayüzü ise BiFunction<T, T, T> açılımından türetilmiştir. Yine bu arayüzlerin de temel türler için olan
    karşılıkları vardır.

    3. Consumer arayüzleri: Bu arayüzler bir ya da iki girişe göre sadece bir işlem yapan bir sonuç üretmeyen işlemlerde
    kullanılır. Bu arayüzler accept metotlarına dahiptir. Consumer<T> arayüzü tek prametreli geri dönüş değeri olmayan,
    BiConsumer<T, U> arayüzü ise iki parametreli geri dönüş değeri olmayan abstract metoda sahiptir.Yine bu arayüzlerin de
    temel türler olan karşılıkları vardır.

    4. Supplier arayüzleri: Bu arayüzler bir giriş almadan bir değer üretmek için gereken işlemlerd kullanılır. Bu
    arayüzlerin get isimli abstract metotları vardır. Bu metotlar parametresiz ve ilgili türden geri dönüş değere
    sahip (generic olan için generic parametre türünden) metotlardır. Yine bu arayüzlerin de temel türler için
    karşılıları bulunur. Bu arayüz grubunda yukarıdaki arayüzlerden farklı olarak boolen türü için BooleanSupplier arayüzü de
    vardır.

    5. Predicate arayüzleri: Bu arayüzler bir giriş veya iki giriş alan ve sonucunda boolean bir değer üretilmesi
    gereken işlemlerde kullanılır. Bu arayüzlerin tests isimli abstract metotları vardır. Yine bu arayüzlerin de
    temel türler için olan karşılıkları vardır.

    Anahtar Notlar: Yukarıda anlatılan arayüzlerin temel tür karşılıkları her tür için ve her işlem için bulunmaz.
    Bu arayüzler, temel türler için çok kullanılanları düşünerek tasarlanmıştır. Ayrıca bazı arayüz grupları için
    Temel türler ve generic türlerin birlikte kullanılan versiyonları da vardır. Örneğin, ObjIntConsumer<T> arayüzü
    T türünden ve int türden parametreli bir accept metoduna sahiptir. Yine örneğin, ToIntBiFunction<T, U> arayüzü
    T ve U türünden parametreli ve int türüne geri dönen applyAsInt metoduna sahiptir.
---------------------------------------------------------------------------------------------------------------------*/
