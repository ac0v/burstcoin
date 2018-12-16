package brs.fluxcapacitor;

import brs.props.Prop;
import brs.props.Props;

enum HistoricalMoments {

  DIGITAL_GOODS_STORE_BLOCK(11800, 1440, Props.DEV_DIGITAL_GOODS_STORE_BLOCK_HEIGHT),
  AUTOMATED_TRANSACTION_BLOCK(49200, 1440, Props.DEV_AUTOMATED_TRANSACTION_BLOCK_HEIGHT),
  AT_FIX_BLOCK_2(67000, 2880, Props.DEV_AT_FIX_BLOCK_2_BLOCK_HEIGHT),
  AT_FIX_BLOCK_3(92000, 4320, Props.DEV_AT_FIX_BLOCK_3_BLOCK_HEIGHT),
  AT_FIX_BLOCK_4(255000, 5760, Props.DEV_AT_FIX_BLOCK_4_BLOCK_HEIGHT),
  PRE_DYMAXION(500000, 71666, Props.DEV_PRE_DYMAXION_BLOCK_HEIGHT),
  POC2(502000, 71670, Props.DEV_POC2_BLOCK_HEIGHT),
  SLOT_FEE_ENFORCING(Integer.MAX_VALUE, Integer.MAX_VALUE, Props.DEV_SLOT_FEE_ENFORCING_BLOCK_HEIGHT), // TBD , proposal main:580000 testnet:130000
  SLOT_FEE_ENFORCING_OPTION_2(Integer.MAX_VALUE, Integer.MAX_VALUE, Props.DEV_SLOT_FEE_ENFORCING_OPTION_2_BLOCK_HEIGHT), // TBD , proposal main:580000 testnet:130000
  DYMAXION(Integer.MAX_VALUE, Integer.MAX_VALUE, Props.DEV_DYMAXION_BLOCK_HEIGHT); // TBD :-)

  final int momentProductionNet;
  final int momentTestNet;
  final Prop overridingProperty;

  HistoricalMoments(int momentProductionNet, int momentTestNet, Prop overridingProperty) {
    this.momentProductionNet = momentProductionNet;
    this.momentTestNet = momentTestNet;
    this.overridingProperty = overridingProperty;
  }
}
