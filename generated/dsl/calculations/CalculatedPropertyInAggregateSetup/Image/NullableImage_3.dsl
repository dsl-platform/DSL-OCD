module CalculatedPropertyInAggregateSetup
{
  aggregate NullableImage_3 {
    Image? nullableImage;

    calculated Image? calculatedNullableImage from 'it => it.nullableImage';

    calculated Image? persistedNullableImage from 'it => it.nullableImage' { persisted; }
  }
}
