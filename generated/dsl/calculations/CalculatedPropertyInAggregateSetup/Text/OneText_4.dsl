module CalculatedPropertyInAggregateSetup
{
  aggregate OneText_4 {
    Text oneText;

    calculated Text calculatedOneText from 'it => it.oneText';

    calculated Text persistedOneText from 'it => it.oneText' { persisted; }
  }
}
