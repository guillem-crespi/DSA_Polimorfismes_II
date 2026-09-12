public class Square extends Rectangle
{
    // Sabem que un cuadrat i un rectangle tenen la mateixa formula de l'àrea, per tant,
    // podem reduïr codi, usant la mateixa formula pels dos
    public Square(double l)
    {
        super(l, l);
    }
}
