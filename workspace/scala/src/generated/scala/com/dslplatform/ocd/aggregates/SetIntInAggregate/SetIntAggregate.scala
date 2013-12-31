package com.dslplatform.ocd.aggregates.SetIntInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetIntAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setInt: Set[Int]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetIntInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetIntAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetIntAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetIntInAggregate.SetIntAggregate): this.type = {
    this.URI = result.URI;
    this._setInt = result._setInt;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetIntInAggregate.SetIntAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setInt")
  def setInt = {
    _setInt
  }

  def setInt_= (value: Set[Int]) {
    _setInt = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setInt") setInt: Set[Int]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setInt = if (setInt == null) Set.empty else setInt)

}

object SetIntAggregate extends AggregateRootCompanion[SetIntAggregate]{

  def apply(
    setInt: Set[Int] = Set.empty
  ) = {
    new SetIntAggregate(
      _locator = None
    , _URI = null
    , _setInt = setInt)
  }

}
