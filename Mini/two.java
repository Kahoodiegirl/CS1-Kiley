class two
{
    public static void main(String args[])
    {
        LocalDate today = Localdate.now();
        LocalDate birthday = LocalDate.of(2009, month, MARCH, 16);
        Period p = Period.between(birthday, today);
        
        System.out.println(p.getDays());
        System.out.println(p.getMonths());
        System.out.println(p.getYears());
    }
}