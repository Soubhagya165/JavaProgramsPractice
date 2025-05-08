interface Speaker {
    void speak();
}

interface Sound {
    void sound();
}

class Politician implements Speaker,Sound {
    public void speak()
    {
        System.out.println("Talk Politics");
    }
    public void sound ()
    {
        System.out.println("Sounds good");
    }
}

class Lecturer implements Speaker {
    public void speak()
    {
        System.out.println("Talk Lectures");
    }
}

class teacher implements Speaker {
    public void speak()
    {
        System.out.println("Talk Studies");
    }
}

public class newInterface implements Speaker {
    public void speak ()
    {
        System.out.println("Implementing Interface");
    }
    public static void main(String[] args) {
        newInterface obj = new newInterface();
        obj.speak();
        Speaker s1 = new Lecturer();
        Speaker s2 = new Politician();
        Speaker s3 = new teacher();
        s1.speak();
        s2.speak();
        s3.speak();
        Sound s4 = new Politician();
        s4.sound();
    }
}