package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneTexts_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneListOfOneTexts: IndexedSeq[String]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneTexts_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneTexts_2("+ URI +")"

   def copy(oneListOfOneTexts: IndexedSeq[String] = this._oneListOfOneTexts): OneListOfOneTexts_2 = {

  require(oneListOfOneTexts ne null, "Null value was provided for property \"oneListOfOneTexts\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneTexts)
    new OneListOfOneTexts_2(_URI = this.URI, __locator = this.__locator, _oneListOfOneTexts = oneListOfOneTexts)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneTexts_2): this.type = {
    this._URI = result._URI
    this._oneListOfOneTexts = result._oneListOfOneTexts
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneTexts_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneListOfOneTexts")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneTexts = {
    _oneListOfOneTexts
  }

  def oneListOfOneTexts_= (value: IndexedSeq[String]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneListOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneTexts") oneListOfOneTexts: IndexedSeq[String]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneListOfOneTexts = if (oneListOfOneTexts == null) IndexedSeq.empty else oneListOfOneTexts)

}

object OneListOfOneTexts_2 extends AggregateRootCompanion[OneListOfOneTexts_2]{

  def apply(
    oneListOfOneTexts: IndexedSeq[String] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneTexts)
    require(oneListOfOneTexts ne null, "Null value was provided for property \"oneListOfOneTexts\"")
    new OneListOfOneTexts_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneListOfOneTexts = oneListOfOneTexts)
  }

}
