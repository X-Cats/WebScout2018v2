export interface Team {
  teamNum: number;
  teamName: string;
  stats: Stats;
}

export interface Stats {
  scaleData: Array<number>;
  switchData: Array<number>;
  oppSwitchData: Array<number>;
  exchangeData: Array<number>;

  focusSwitch: number;
  focusScale: number;
  focusOppSwitch: number;
  focusExchange: number;

  percentFocusScale: number;
  percentFocusSwitch: number;
  percentFocusOppSwitch: number;
  percentFocusExchange: number;

  focusedAverageSwitch: number;
  focusedAverageScale: number;
  focusedAverageOppSwitch: number;
  focusedAverageExchange: number;

  maxCubesAutoSwitch: number;
  maxCubesAutoScale: number;
  maxCubesAutoCombined: number;

  scaleAutoCapability: boolean;
  switchAutoCapability: boolean;
  multicubeAutoCapability: boolean;

  averageTotalCubes: number;

  totalMatchesPlayed: number;
}
