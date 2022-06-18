class CarData {
public static ArrayList<Car> carList= new
ArrayList<>();
public void addCar(String carType, String
polNum, String merk){
carList.add(new
Car(carType,polNum,merk));
}
public void listOfCar(){
System.out.println("---------------------
----------");
System.out.println(" DAFTAR MOBIL ");
System.out.println("---------------------
----------");
for (Car sc : CarData.carList) {
System.out.println("TIPE MOBIL : "
+ sc.getCarType());
