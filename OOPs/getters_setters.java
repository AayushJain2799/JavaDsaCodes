public class getters_setters {

    public static class BankAcct
    {
        private int acctno;
        private int pwd;
        private String name;
        private String ifsc;
        private String address;

        public int getAcctno()
        {
            return acctno;
        }
        public void setAcctno(int acct_no)
        {
            acctno = acct_no;
        }
        
        
    }
    public static void main(String[] args) {
        BankAcct acct = new BankAcct();
        acct.setAcctno(12345);

        System.out.println("Acct no is "+acct.getAcctno());

    }
}
