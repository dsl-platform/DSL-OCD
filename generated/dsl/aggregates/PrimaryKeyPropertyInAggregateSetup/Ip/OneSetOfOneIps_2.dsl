module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfOneIps_2(oneSetOfOneIps) {
    Set<Ip> oneSetOfOneIps;
  }
}
