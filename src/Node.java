public class Node implements Comparable<Node> {
    int count;
    char character;
    Node left, right;

    public Node(){
        character = '\0';
        count = 0;
        left = right = null;
    }

    public Node(char character, int count){
        this.character = character;
        this.count = count;
    }

    public Node(int count, Node left, Node right){
        character = '\0';
        this.count = count;
        this.left = left;
        this.right = right;
    }

    public int getCount(){ return count; }

    public char getCharacter(){ return character; }

    @Override
    public int compareTo(Node o) {
        if(this.count == o.count && this.character == o.character) return 0;
        if(this.count < o.count){
            return -1;
        } else if(this.count > o.count){
            return 1;
        } else if(this.character < o.character){
            return -1;
        } else return 1;
    }

    @Override
    public String toString(){
        if(character == '\0'){
            return new String("(" + count + ")");
        }   return new String("(" + character + "," + count + ")");
    }
}