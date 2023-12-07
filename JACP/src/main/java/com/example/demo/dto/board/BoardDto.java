package com.example.demo.dto.board;

public record BoardDto (
    Long idx,
    String boardTitle,
    String boardContent,
    String boardKind,
    String regId,
    String regDt
) {
	
}

/*{
    public static BoardDto of(Long idx,
    	    String boardTitle,
    	    String boardContent,
    	    String boardKind,
    	    String regId,
    	    String regDt) {
    	return new BoardDto(idx,
    		    boardTitle,
    		    boardContent,
    		    boardKind,
    		    regId,
    		    regDt);
    }
    
    public Board toEntity() {
        return Board.builder()
                .passId(id)
                .name(name)
                .count(count)
                .price(price)
                .startedDay(startedDay)
                .endedDay(endedDay)
                .build();
    }
}*/