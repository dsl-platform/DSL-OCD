module CalculatedPropertyInAggregateSetup
{
  aggregate OneImage_4 {
    Image oneImage;

    calculated Image calculatedOneImage from 'it => it.oneImage';

    calculated Image persistedOneImage from 'it => it.oneImage' { persisted; }
  }
}
