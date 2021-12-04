const common = {
	
	// 공백 및 null 체크
	// object 는 검사 로직 아직 없음
	isEmpty( value ) {
		if ( 'number' === typeof value && 0 < value ) {
			return false;
		}
		else {
			return (
				null === value ||
				undefined === value ||
				0 === value.length ||
				"" === value
			)
		}
	},
}

export default ( context, inject ) => {
	inject( "common", common );
};