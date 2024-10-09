public class Artist {
    public String name; 
    public boolean IsSolo; 

    public Artist(String name, boolean IsSolo) {
        this.name = name; 
        this.IsSolo = IsSolo; 
    }
    
    public String getName() {
        return name; 
    }

    public boolean IsSolo() {
        return IsSolo; 
    }

    public void printArtistDetails() {
        String type;
        if (IsSolo) {
            type = "Solo Artist";
        } else {
            type = "Band";
        }
        System.out.println("Artist: " + name + " | Type: " + type);
    }
}