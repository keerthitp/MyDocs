import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MotorcycleMain {

    public static void main(String[] args) {
        List<Motorcycle> bikes = new ArrayList<>();

        bikes.add(new Motorcycle(1, "123445", "Harley-Davidson", "Iron 1200", "2014", "red", 500, 125, 100));
        bikes.add(new Motorcycle(2, "135932", "Honda", "CB300R", "2016", "black", 400, 125, 125));
        bikes.add(new Motorcycle(3, "394384", "Yamaha", "YZF-R3", "2007", "blue", 600, 200, 80));
        bikes.add(new Motorcycle(4, "234565", "Kawasaki", "ZX-6R", "2019", "white", 550, 300, 120));
        bikes.add(new Motorcycle(5, "986784", "Suzuki", "SV650X", "2001", "black", 520, 200, 90));
        bikes.add(new Motorcycle(6, "234584", "Husqvarna", "Svartpilen 401", "2012", "green", 400, 125, 130));

        List<Motorcycle> lightBikes =
                bikes.stream().filter(bike -> bike.getWeight()<500).collect(Collectors.toList());

        for(Motorcycle moto : lightBikes)
            System.out.println(moto.getModel()+ ": "+ moto.getWeight());

        Map<Integer, List<Motorcycle>> groupBikes =
                bikes.stream().collect(Collectors.groupingBy(b->b.getCc()));


        double avgTopSpeed = bikes.stream().mapToInt(b -> b.getTopSpeed()).average().getAsDouble();

        int maxTopSpeed = bikes.stream().mapToInt(b-> b.getTopSpeed()).max().getAsInt();

       // Map<String, Integer> motoWithTopSpeed =
               // bikes.stream().forEach();
    }
}
