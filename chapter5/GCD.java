/** Fast method with Euclidean Algorithm */
public static long gcd(long n, long m) {
  while (n != 0 && m != 0) {
    if(n > m){
      n = n % m;
    }
    else {
      m = m % n;
    }
  }
  return n > m ? n : m;
}
