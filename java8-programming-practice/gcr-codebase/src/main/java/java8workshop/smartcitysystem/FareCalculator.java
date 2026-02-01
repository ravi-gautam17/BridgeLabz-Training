package java8workshop.smartcitysystem;

//Functional Interface: For custom fare logic using Lambdas
@FunctionalInterface
interface FareCalculator {
 double calculate(double basePrice, double distance);
}
