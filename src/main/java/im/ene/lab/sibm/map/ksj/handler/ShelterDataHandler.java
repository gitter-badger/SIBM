package im.ene.lab.sibm.map.ksj.handler;

import im.ene.lab.sibm.map.ksj.Data;
import im.ene.lab.sibm.models.ShelterPoint;

import java.util.ArrayList;
import java.util.List;

public class ShelterDataHandler extends KsjHandler {

	public ShelterPoint[] getShelterPoints() {
		List<ShelterPoint> ret = new ArrayList<ShelterPoint>();

		for (Data data : this.getDataMap().values()) {
			// System.out.println(data.toString());
			assert (data instanceof ShelterPoint) : data.getClass();
			ret.add((ShelterPoint) data);
		}

		return ret.toArray(new ShelterPoint[ret.size()]);
	}

	@Override
	protected boolean checkData() {
		boolean ret = true;
		for (Data data : this.getDataMap().values()) {
			if (!(data instanceof ShelterPoint)) {
				System.out.println(this.getClass() + ": " + data.getClass());
				ret = false;
				break;
			}
		}
		return ret;
	}

}
