import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

// Kullanıcı adı ve şifre bilgileri
String userName = "kullaniciadi";
String password = "sifre";

// Başlangıç bakiyesi
double balance = 1500.0;

// Kullanıcının girdiği kullanıcı adı ve şifre
String inputUserName;
String inputPassword;

// Giriş denemesi sayacı
int loginAttempts = 3;

// Scanner sınıfı kullanarak kullanıcıdan veri girişi alınır
Scanner input = new Scanner(System.in);

// Kullanıcı adı ve şifre doğru girilene kadar kullanıcıya üç deneme hakkı verilir
while (loginAttempts > 0) {
    System.out.print("Kullanıcı adınızı girin: ");
    inputUserName = input.nextLine();
    

    System.out.print("Şifrenizi girin: ");
    inputPassword = input.nextLine();

    // Kullanıcı adı ve şifre doğruysa, ana menüye erişim sağlanır
    if (inputUserName.equals(userName) && inputPassword.equals(password)) {
        System.out.println("Giriş başarılı. Hoş geldiniz!");

        boolean isLoggedIn = true; // Kullanıcının giriş yaptığını belirtmek için bir değişken oluşturuldu

        // Ana menü
        while (isLoggedIn) {
            System.out.println("1 - Para yatırma");
            System.out.println("2 - Para çekme");
            System.out.println("3 - Bakiye sorgulama");
            System.out.println("4 - Çıkış");

            // Kullanıcının seçtiği işlem
            int choice = input.nextInt();
            input.nextLine();

            // Switch case yapısı ile kullanıcının seçtiği işleme göre işlem yapılır
            switch (choice) {
                case 1:
                    System.out.print("Yatırmak istediğiniz miktarı girin: ");
                    double depositAmount = input.nextDouble();
                    balance += depositAmount;
                    System.out.println(depositAmount + " TL hesabınıza yatırıldı.");
                    break;

                case 2:
                    System.out.print("Çekmek istediğiniz miktarı girin: ");
                    double withdrawAmount = input.nextDouble();

                    if (withdrawAmount > balance) {
                        System.out.println("Hesabınızda yeterli bakiye yok.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println(withdrawAmount + " TL hesabınızdan çekildi.");
                    }
                    break;

                case 3:
                    System.out.println("Hesap bakiyeniz: " + balance + " TL");
                    break;

                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    System.exit(0);
                    isLoggedIn = false; // Kullanıcı çıkış yapmak istediğinde isLoggedIn değişkeni false olarak ayarlanır
                    break;

                default:
                    System.out.println("Geçersiz seçim. Lütfen yeniden deneyin.");
                    break;
            }
        }
    } else {
        loginAttempts--;
        System.out.println("Kullanıcı adı veya şifre yanlış. Kalan deneme hakkınız: " + loginAttempts);
    }
}

// Üç başarısız giriş denemesi sonrasında program sonlandırılır
System.out.println("Hesabınız bloke edildi. Lütfen bankanızla iletişime geçin.");

System.exit(0);




if (input != null) {
    input.close();}
}
}

/*import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

         // Kullanıcı adı ve şifre bilgileri
        String userName, password;
        Scanner input = new Scanner(System.in);

        // Giriş denemesi sayacı
        int right = 3;
        
         // Başlangıç bakiyesi
        int balance = 1500;
        
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();

            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("admin") && password.equals("12345")) {
                System.out.println("Merhaba, Hoşgeldiniz!");

                boolean isLoggedIn = true;

                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                System.out.println("\n1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");

                select = input.nextInt();

                switch (select) {
                    case 1:
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("Para miktarı : ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : " + balance+ "TL");
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        isLoggedIn = false;
                        System.exit(0);
                        break;

                    default:                    
                    System.out.println("Yanlış seçim tekrar deneyiniz.");
                    break;
                }

            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Kalan Hakkınız : "+ right);
                    if (right == 0) {
                        System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                        System.exit(0);
                    } 

            }
        }
        if (input != null) {
            input.close();
        }
}
    }
*/