package primeFactors;
import java.util.ArrayList;
import java.util.List;

public class primeFactors {
    public List<Integer> generate(int num) {
        List<Integer> primes = new ArrayList<Integer>();

        for (int candidate = 2; num > 1; candidate++)
            for (; num % candidate == 0; num/=candidate)
                primes.add(candidate);

        return primes;



    }
}


