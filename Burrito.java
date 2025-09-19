public class Burrito {
    private String size; //small or large
    private String proteins;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getProteins() {
        return proteins;
    }

    public void setProteins(String proteins) {
        this.proteins = proteins;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getBeans() {
        return beans;
    }

    public void setBeans(String beans) {
        this.beans = beans;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public Boolean getGuac() {
        return guac;
    }

    public void setGuac(Boolean guac) {
        this.guac = guac;
    }

    private String toppings;
    private String beans;
    private String rice;
    private Boolean guac;

    public Burrito()
    {
        this.size = "small";
        this.proteins = "none";
        this.rice = "no";
        this.beans = "no";
        this.toppings = "no";
        this.guac = false;
    }

    public Burrito(String size, String protein){
        this.size = size;
        this.proteins = protein;
    }

    public Burrito(String s, String p, String r, String b, String t, Boolean g)
    {
        this.size = s;
        this.proteins = p;
        this.rice = r;
        this.beans = b;
        this.toppings = t;
        this.guac = g;
    }

    public String hasGuac()
    {
        if(this.guac)
        {
            return "Guacamole";
        }
        else
        {
            return "No Guacamole";
        }
    }

    public double getCost()
    {
        double total_cost = 0.00;
        if(this.size.equals("small"))
        {
            total_cost += 5.00;
        }
        if(this.size.equals("large"))
        {
            total_cost += 7.50;
        }
        if(this.proteins.equals("chicken") || this.proteins.equals("steak"))
        {
            total_cost += 2.00;
        }
        if(this.proteins.equals("carnitas") || this.proteins.equals("sofritas"))
        {
            total_cost += 3.00;
        }
        if(this.rice != null)
        {
            if(!this.rice.equals("no"))
            {
                total_cost += 1.00;
            }
        }
        if (this.beans != null)
        {
            if(!this.beans.equals("no"))
            {
                total_cost += 1.00;
            }
        }
        if(this.guac != null)
        {
            if(this.guac.equals(true))
            {
                total_cost += 2.00;
            }
        }

        return total_cost;
    }

    @Override
    public String toString()
    {
        return this.size + " " + this.proteins + " Burrito with " + this.rice + " rice, " + this.beans + "beans, " + this.toppings + ", " + hasGuac() + ", and the cost is $" + getCost();
    }
}
