module CalculatedPropertyInValueSetup
{
  value NullableListOfOneIps_4 {
    List<Ip>? nullableListOfOneIps;

    calculated List<Ip>? calculatedNullableListOfOneIps from 'it => it.nullableListOfOneIps';

    calculated List<Ip>? persistedNullableListOfOneIps from 'it => it.nullableListOfOneIps' { persisted; }
  }
}
