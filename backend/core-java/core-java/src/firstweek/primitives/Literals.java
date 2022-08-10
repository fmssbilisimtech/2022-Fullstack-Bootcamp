package firstweek.primitives;

public class Literals { }

/*----------------------------------------------------------------------------------------------------------------------
	 Sabitler (literals):
	 Program içerisinde doğrudan yazılan sayılara sabit denir. Sabitlerin de türleri vardır. Derleyici de  sabitin
	 türüne	 göre işlem yapar.

	 Sabitlerin türlerine ilişkin detaylar:
	 - Sayı nokta içermiyorsa ve sonuna bir ek almamışsa ve int türü sınırları içerisinde ise int türdendir. Sınırlar
	 dışında ise error oluşur
	 Örneğin: 10, 20, 2000000

	 - Sayı nokta içermiyorsa ve sonuna L (küçük veya büyük) ekini almışsa long türdendir. Sayı long türü
	 sınırları dışındaysa error oluşur.
	 Örneğin: 10L, 4000000000L

	 - Java' da byte ve short türlerinden sabit yoktur

	 - Sayı nokta içeriyorsa ve hiç bir son ek almamışsa double türdendir. Sınırlar dışında kalıyorsa error oluşur

	 Örneğin: 3.4, 456.123

	 - Sayı nokta içersin ya da içermesin sonuna D (küçük veya büyük) ekini almışsa double türdendir.
	 Örneğin: 10d, 1.2d, 4.5D

	 - Sayı nokta içersin ya da içermesin sonuna F (küçük veya büyük) ekini almışsa float türdendir
	 Örneğin: 3f, 2.3F

	 - boolean türden iki tane sabit vardır:true, false

	 - char türden sabitler: Tek tırnak içerisinde yazılan uygun karakter(ler) tek tırnağı ile birlikte char türden
	 sabittir. Örneğin: 'z' sabiti z karakterinin tablodaki sıra numarasına karşılık gelir.

	 bazı karakterlerin görüntü karşılı yoktur. Hatta bazı karakterler klavyden doğrudan yazılamazlar.
	 Bu tip karakterlere escape sequence karakterler denir. Bu karakterler tek tırnak içerisinde ters bölü karakteri
	 ile birlikte yazılırlar. Java'daki escape sequence karakter ile özel karakterler şunlardır:
	 '\b' -> backspace
	 '\r' -> carriage return
	 '\f' -> form feed
	 '\n' -> line feed
	 '\t' -> horizontal tab
	 '\0' -> null character
	 '\\' -> back slash
	 '\'' -> single quote
	 '\"' -> double quote (optional)
----------------------------------------------------------------------------------------------------------------------*/

