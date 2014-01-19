module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOneFloats_3 {
    List<Float>? nullableListOfOneFloats;

    calculated List<Float>? calculatedNullableListOfOneFloats from 'it => it.nullableListOfOneFloats';

    calculated List<Float>? persistedNullableListOfOneFloats from 'it => it.nullableListOfOneFloats' { persisted; }
  }
}