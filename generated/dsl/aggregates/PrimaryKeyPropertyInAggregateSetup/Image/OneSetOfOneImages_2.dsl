module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfOneImages_2(oneSetOfOneImages) {
    Set<Image> oneSetOfOneImages;
  }
}
