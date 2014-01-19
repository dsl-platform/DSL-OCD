module CalculatedPropertyInValueSetup
{
  value OneText_5 {
    Text oneText;

    calculated Text calculatedOneText from 'it => it.oneText';

    calculated Text persistedOneText from 'it => it.oneText' { persisted; }
  }
}
