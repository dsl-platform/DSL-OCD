module CalculatedPropertyInAggregateSetup
{
  aggregate NullableText_3 {
    Text? nullableText;

    calculated Text? calculatedNullableText from 'it => it.nullableText';

    calculated Text? persistedNullableText from 'it => it.nullableText' { persisted; }
  }
}
