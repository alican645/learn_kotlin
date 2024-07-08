package com.example.kotlinfirstapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // gerekli olduğu zamanlarda bütün fonksiyonlar tarafında
    // kullanılacak değişkenler burada tanımlanır.

    //var calismaSinifi : SinifCalismasi
    lateinit var sinifCalismasi: SinifCalismasi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //yazılacak program onCreate fonksiyonun içine yazılır.
        println("merhaba dünya")// logcat'e yazdırılmasını sağlar.

        //veri tipler ve değişkenler

        // val>>value and var>>variable
        // val ve var farkı şudur : val ile tanımlanan
        // değer sonradan değiştirelemez.Fakat var
        // ile tanımlanan değer sonradan da değiştirilebilir.

        println("///////////Tam Sayılar/////////")
        var x=10
        println(x)
        println(x*20)

        val z=20
        println(z)

        var ornekLong : Long = 10
        var ornekByte: Byte =20
        val ornekInt : Int =30

        // Değişken isimlendirme
        val kullanici_yasi=35 //>> snake_case
        val KullaniciYasi=35 ///>>camelCase
        println("///////////Kesirli Sayılar/////////")

        val pi=3.14
        // int/int=int>>5/2=2
        // double/double=double>>5.0/2.0=2.5

        val ornekDouble : Double=2.5
        val ornekFloat : Float=2.5f //>> Kotlinde float bir değişken tanımlamak istersek değerin sonuna "f" koyulur

        println("///////////String İfadeler/////////")

        val benimStringim="Benim Stringim"
        println(benimStringim)

        val ornekString : String //>> initialize edilmemiş değişken
        ornekString="orNek StrInG" // initialize edilmiş değişken
        println(ornekString.uppercase())
        println(ornekString.lowercase())

        println("///////////Veri Tipi Dönüşümleri/////////")
        val ornekDouble1 : Double =32.1254856594
        println(ornekDouble1)
        val ornekInt1: Int =ornekDouble1.toInt()
        println(ornekInt1)
        val ornekString1 : String = ornekDouble1.toString()
        println(ornekString1)

        val stringYas= "20"
        println(stringYas)
        val intYas=stringYas.toInt()
        println(intYas)

        println("///////////Boolean İfadeler/////////")
        var isTrue=20>15
        println(isTrue)

        var isFalse: Boolean =false
        //>,<,==,>=,<=,!=,&&,||
        println("asd"=="ass")
        println("asd"!="ass")

        println("///////////Veri Yapıları/////////")

        println("///////////Diziler-Array Yapısı/////////")
        //Arraylerin olayı içinde birden fazla eleman tutabilmesidir.
        //Arraylere sonradan eleman eklemek ve çıkarmak mümkün değildir.
        var arrayEleman1: String="asd"
        var arrayEleman2: Double =3.8569
        val myArray= arrayOf("eleman1",1,2,arrayEleman1,3.14,arrayEleman2)// farklı tipteki değişkenler için hazırlanmış array metodudur.
        println(myArray[5])
        println(myArray[0])
        println(myArray.get(3))
        println(myArray.size) // >> array'in kaç eleman olduğunu döndüren metod.
        println(myArray.reverse()) // >> array'in elemanlarını tersten sıralayan metod.
        println( myArray.last()) //>> Array'in son elemanını döndüren metod.

        myArray[0]="asldkjalsd" //>> array'in 0. indexindeki elemanı değiştirdik bu olay
        // array value olarak tanımlanmasına rağmen olmuştur kotlin buna izin verir.

        println("///////////Liste Yapısı/////////")

        val myList = arrayListOf("125",5,true,5.12)
        println(myList.size)
        myList.add("Sonradan Eklenen Eleman")
        println(myList.last())
        myList[4]="Değiştirilen eleman"
        println(myList.last())

        val myList1= arrayListOf<Int>()
        val myList2= arrayListOf<String>()
        val myList3= arrayListOf<Any>()//>>Karışık bir list yapmak için Any(herhangi) kullanılabilir.

        println("//////////Set Yapısı/////////")
        //set yapılarının içine birbirinin aynısı iki eleman koyulabilir ama set birbirinden farklı olan elemanları için işlemlerini gerçekleştirir
        //örneğin aşağıdaki set yapısı 9 elemandan oluşmasına rağmen size metodu bize 6 rakamını döndürür.
        //çünkü set yapısının içinde 6 tane farklı eleman vardır.
        val mySet= setOf(10,10,10,20,50,30,80,40,40)
        println(mySet.size)

        println("//////////Map Yapısı/////////")
        // Anahtar - Değer Eşleşmesi ile çalışır.
        val myMap= hashMapOf<String,Int>()
        myMap.put("anahtar1",12)
        myMap.put("anahtar2",15)

        val myMap1= hashMapOf<String,Any>()


        println("//////////IF Yapısı/////////")
        if (5>3){
            println("İfade Doğrudur")
        }else{
            println("İfade Yanlıştır")
        }

        println("//////////WHEN Yapısı/////////")

        val not=0
        var notString=""
        when(not){
            0->notString="geçersiz not"
            1->notString="zayıf not"
            2->notString="kötü not"
            else->notString="Hatalı"
        }
        println(notString)

        val not1=5

        when(not1){
            0->{
                println("geçersiz not")
            }
            1->{
                println("zayıf not")
            }
            2->{
                println("kötü not")
            }
            else->{
                println("Hatalı")
            }
        }


        println("//////////WHİLE Yapısı/////////")

        var j=0
        while(j<10){
            println("j:${j}")
            j++
        }

        println("//////////FOR Yapısı/////////")

        val dizi= arrayOf(1,2,5,9,7,8,1,)
        for (numara in dizi){
            println("eleman: ${numara}")
        }


        for (a in 0..9){
            println("eleman2: ${a}")
        }

        println("//////////Fonksiyonlar/////////")
        birinciFonksiyon("birinci fonksiyon çalıştırıldı")

        println(ucuncuFonkisyon("üçüncü fonksiyon çalıştırıldı"))

        println("//////////Sınıflar/////////")
        //kotlinde secondary constructor yapısı kullanımı
        //var sinifCalismasi1=SinifCalismasi()
        //sinifCalismasi1.meslek="Marangoz"
        //sinifCalismasi1.isim="Ahmet"
        //sinifCalismasi1.yas=35
        //println(sinifCalismasi1.meslek)
        //sınıf eğer constructor'sız yazılmış ise bu şekil bir
        //kullanım gerçekleştirilebilir.

        println("primary constructor yapısı kullanımı")
        var sinifCalismasi2=SinifCalismasi(isim = "Ahmet", meslek = "Marangoz", yas = 30)
        println(sinifCalismasi2.isim)

        println("//////////Nullability/////////")
        var kullaniciGirdisi="20"
        var kullaniciGirdisi2="20"
        var kullaniciGirdisiInt=kullaniciGirdisi.toInt()
        var kullaniciGirdisi2Int = kullaniciGirdisi2.toIntOrNull()
        println(kullaniciGirdisiInt*5)
        println(kullaniciGirdisi2Int)

        var benimDoble : Double? //nullable bir değer döndürebilir anlamına gelen kullanım
        var benimDoble2 : Double?=null

        //elvis operatörü

        var benimInt : Int? =null

        println(benimInt?:185*2)

        //let metodu eğer değişken null değilse çalışan bir yapıdır.
        benimInt?.let {
            println("bu değişken null değil")
        }











    }

    //yazılacak fonksiyonlar buraya yazılır.

    fun birinciFonksiyon(ifade : String){
        println(ifade)
    }

    fun ikinciFonkisyon(ifade : Int) : Int{
        return ifade
    }

    fun ucuncuFonkisyon(ifade : String) : String{
        return ifade
    }
}