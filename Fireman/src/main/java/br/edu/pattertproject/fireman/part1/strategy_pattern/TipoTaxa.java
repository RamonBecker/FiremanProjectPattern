package br.edu.pattertproject.fireman.part1.strategy_pattern;

public enum TipoTaxa {
	ANUAL {
		@Override
		public StrategyTaxa obterTipoTaxa() {
			return new TaxaAnual();
		}
	},

	IMPOSTO {
		@Override
		public StrategyTaxa obterTipoTaxa() {
			return new TaxaImposto();
		}
	};

	public abstract StrategyTaxa obterTipoTaxa();
	
}
