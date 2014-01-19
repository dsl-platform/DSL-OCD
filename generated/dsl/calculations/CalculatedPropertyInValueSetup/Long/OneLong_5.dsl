module CalculatedPropertyInValueSetup
{
  value OneLong_5 {
    Long oneLong;

    calculated Long calculatedOneLong from 'it => it.oneLong';

    calculated Long persistedOneLong from 'it => it.oneLong' { persisted; }
  }
}
