package chap21;

public class WildcardGeneric<W> {
  W wildcard;

  public void setWildcard(W wildCard) {
    this.wildcard = wildCard;
  }

  public W getWildcard() {
    return wildcard;
  }
}
