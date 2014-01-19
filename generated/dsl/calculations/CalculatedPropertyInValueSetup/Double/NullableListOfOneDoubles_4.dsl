module CalculatedPropertyInValueSetup
{
  value NullableListOfOneDoubles_4 {
    List<Double>? nullableListOfOneDoubles;

    calculated List<Double>? calculatedNullableListOfOneDoubles from 'it => it.nullableListOfOneDoubles';

    calculated List<Double>? persistedNullableListOfOneDoubles from 'it => it.nullableListOfOneDoubles' { persisted; }
  }
}
