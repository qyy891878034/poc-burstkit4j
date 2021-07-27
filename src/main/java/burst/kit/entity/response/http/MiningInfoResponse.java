package burst.kit.entity.response.http;

import java.math.BigDecimal;

@SuppressWarnings("unused")
public class MiningInfoResponse extends BRSResponse {
    private final String generationSignature;
    private final long baseTarget;
    private final long height;
    
    private BigDecimal capacity;

    public MiningInfoResponse(String generationSignature, long baseTarget, long height,BigDecimal capacity) {
        this.generationSignature = generationSignature;
        this.baseTarget = baseTarget;
        this.height = height;
        this.capacity = capacity;
    }

    public String getGenerationSignature() {
        return generationSignature;
    }

    public long getBaseTarget() {
        return baseTarget;
    }

    public long getHeight() {
        return height;
    }
    
    public BigDecimal getCapacity() {
    	return capacity;
    }
}
