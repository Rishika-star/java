class Library{
    String libraryName;
    String location;

    public Library(String libraryName,String location){
        this.libraryName=libraryName;
        this.location=location;
    }

    public String getLibraryName(){
        return libraryName;
    }
    public String getLocation(){
        return location;
    }
   
}

 class Section extends Library(){
        String sectionName;

        public Section(String libraryName,String location,String sectionName){
             super(libraryName,location);
             this.sectionName=sectionName;
        }

        public String getSectionName(){
            return sectionName;
        }
    }
    class Books extends Section(){
        String bookTitle;
        String bookAuthor;
        int price;
        static int totalPrice=0;

        public Book(String libraryName,String location,String sectionName,String bookTitle,String bookAuthor,int price){
            super(libraryName,location,sectionName);
             this.bookTitle=bookTitle;
             this.bookAuthor=bookAuthor;
             this.price=price;
             totalPrice+=price;
        }

        public String getBookTitle(){
            return bookTitle;
        }
        public String getbookAuthor(){
            return bookAuthor;
        }
        public int getPrice(){
           return price;

        }

        public static int getTotalPrice(){
            return totalPrice;
        }
    }