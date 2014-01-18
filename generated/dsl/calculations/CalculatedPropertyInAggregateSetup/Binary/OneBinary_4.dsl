module CalculatedPropertyInAggregateSetup
{
  aggregate OneBinary_4 {
    Binary oneBinary;

    calculated Binary calculatedOneBinary from 'it => it.oneBinary';

    calculated Binary persistedOneBinary from 'it => it.oneBinary' { persisted; }
  }
}
