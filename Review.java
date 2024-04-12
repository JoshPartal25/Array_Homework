public class Review{
    
    public int rating;

    public Review(int pRating){
        // TODO: set the instance variable to the parameter
        this.rating = pRating;
    }

    public void print(){
        //TODO: use System.out to print the values of the 
        //      instance varibles so the user can see the review
        System.out.println("Rating: " + rating);
    }

    
}