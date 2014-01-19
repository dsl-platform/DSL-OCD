module CalculatedPropertyInValueSetup
{
  value NullableListOfNullableFloats_4 {
    List<Float?>? nullableListOfNullableFloats;

    calculated List<Float?>? calculatedNullableListOfNullableFloats from 'it => it.nullableListOfNullableFloats';

    calculated List<Float?>? persistedNullableListOfNullableFloats from 'it => it.nullableListOfNullableFloats' { persisted; }
  }
}
